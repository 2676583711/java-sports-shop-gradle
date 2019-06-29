package cn.zhou.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//springmvc拦截器，用于验证是否处于登录状态，否则跳转到登录页面
public class CaptchaIntercepter extends HandlerInterceptorAdapter {

	// controller执行之前
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		return super.preHandle(request, response, handler);

		// 获取 request域数据
//		String captcha = (String) request.getAttribute("captcha");

		// 获取提交数据
		String captcha = request.getParameter("captcha");
		System.out.println("拦截器-验证码=" + captcha);

		// 验证码不能为空
		if (StringUtils.isBlank(captcha)) {
			request.setAttribute("error", "验证码不能为空!!!");
			System.out.println("拦截器-验证码不能为空!!!");
			response.sendRedirect("/front/toLogin.shtml");
			return false;
		}

		// 如果用户名，密码，验证码都正确，就跳转用户中心
		if (!captcha.equals("zhou")) {
			request.setAttribute("error", "验证码错误!!!");
			System.out.println("拦截器-验证码错误!!!");
			response.sendRedirect("/front/toLogin.shtml");
			return false;
		}

		System.out.println("拦截器过关");
		return true;
	}

	/*
	 * postHandle：后处理回调方法，实现处理器的后处理
	 * 
	 * controller执行之后，渲染视图之前执行此方法
	 * 
	 * 此时我们可以通过modelAndView（模型和视图对象）
	 * 
	 * 对模型数据进行处理或对视图进行处理，modelAndView也可能为null。
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	/*
	 * afterCompletion：
	 * 
	 * 整个请求处理完毕回调方法，即在视图渲染完毕时回调，
	 * 
	 * 如性能监控中我们可以在此记录结束时间并输出消耗时间，
	 * 
	 * 还可以进行一些资源清理，类似于try-catch-finally中的finally，
	 * 
	 * 但仅调用处理器执行链中preHandle返回true的拦截器的afterCompletion。
	 * 
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	/*
	 * 相对于HandlerInterceptor，
	 * HandlerInterceptorAdapter多了一个实现方法afterConcurrentHandlingStarted()，
	 * 它来自HandlerInterceptorAdapter的直接实现类AsyncHandlerInterceptor,
	 * AsyncHandlerInterceptor接口直接继承了HandlerInterceptor，
	 * 并新添了afterConcurrentHandlingStarted()方法用于处理异步请求，当Controller中有异步请求方法的时候会触发该方法时，
	 * 异步请求先支持preHandle、然后执行afterConcurrentHandlingStarted。异步线程完成之后执行preHandle、
	 * postHandle、afterCompletion。
	 * 
	 */
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

}

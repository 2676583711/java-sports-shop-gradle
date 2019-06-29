package cn.zhou.core.controller.front;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/front")
public class BuyerController {

	// 跳转前台用户管理中心界面 (已经登录的界面)
	@RequestMapping(value = "/index.shtml")
	public String sku() {
		return "/buyer/index";
	}

	// 跳转前台登录界面首页
	@RequestMapping(value = "/toLogin.shtml")
	public String toLogin() {
		return "/buyer/login";
	}

	// 处理前台登录的相关事项
	@RequestMapping(value = "/login.shtml")
	public String login(String username, String password, String captcha, ModelMap mp) {
		// 用户名不能为空
		if (StringUtils.isBlank(username)) {
			mp.addAttribute("error", "用户名不能为空!!!");
			return "/buyer/login";
		}
		// 密码不能为空
		if (StringUtils.isBlank(password)) {
			mp.addAttribute("error", "密码不能为空!!!");
			return "/buyer/login";
		}
		// 验证码不能为空
		if (StringUtils.isBlank(captcha)) {
			mp.addAttribute("error", "验证码不能为空!!!");
			return "/buyer/login";
		}

		int i = 0;
		// 如果用户名，密码，验证码都正确，就跳转用户中心
		if (username.equals("zhou")) {
			mp.addAttribute("error", "用户名错误!!!");
//			return "index.shtml";
			i += 1;
		}
		// 如果 密码 正确，就跳转用户中心
		if (password.equals("zhou")) {
			mp.addAttribute("error", "密码错误!!!");
//			return "index.shtml";
			i += 1;
		}
		// 如果用户名，密码，验证码都正确，就跳转用户中心
		if (captcha.equals("zhou")) {
			mp.addAttribute("error", "验证码错误!!!");
//			return "index.shtml";
			i += 1;
		}

		if (i >= 3) {
			i = 0;
			return "/buyer/index";
		}

		// 否则，跳转登录界面，重新登录
		return "/buyer/login";
	}

}

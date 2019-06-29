package cn.zhou.common;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

/**
 * 获取tomcat下面的项目的全网站路径
 * 
 * 继承ServletContextAware接口实现功能
 * 
 * 其他类继承使用
 * 
 * @author zhou
 *
 */
public class ObtainPath implements ServletContextAware {

	public static ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext servletContext) {
		ObtainPath.servletContext = servletContext;
	}

	/**
	 * 获取tomcat下面的项目路径
	 * 
	 * @param path
	 * @return
	 */
	public static String getPath(String path) {
		return servletContext.getRealPath(path);
	}
}

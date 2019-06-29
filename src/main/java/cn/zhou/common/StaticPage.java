package cn.zhou.common;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import division_page.PageBean;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 静态页面生成工具
 * 
 * @author zhou
 *
 */
public class StaticPage extends ObtainPath {

	// @Autowired
	private Configuration configuration;

	// set方法注入
	public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
		this.configuration = freeMarkerConfigurer.getConfiguration();
	}

	public void generate(String templateName, String outPath, Map dataModel) {
		// 根据 outPath获取完整的outPath项目路径(绝对路径)
		String path = getPath(outPath);
		// 完整路径的父路径
		String parent = new File(path).getParent();
		// 若父路径不存在则创建
		if (!new File(parent).exists()) {
			new File(parent).mkdirs();
		}
		// 得到输出生成文件的路径(完整路径)
		String fullPath = path + templateName;

		System.out.println("fullPath=" + fullPath);

		try {
			// 加载模板
			Template template = configuration.getTemplate(templateName);
			// 输出流
			FileWriterWithEncoding fileWriterWithEncoding = new FileWriterWithEncoding(new File(fullPath), "utf-8");

			// 写入生成文件
			template.process(dataModel, fileWriterWithEncoding);

			// 关闭流
			fileWriterWithEncoding.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}

package cn.zhou.core.controller.front;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zhou.captcha.GenerateCapthca;

/**
 * 验证码servlet，生成验证码并且返回
 * 
 * Servlet implementation class CaptchaServlet
 */
public class CaptchaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CaptchaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response.getWriter()返回的是PrintWriter，这是一个打印输出流。
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		UUID randomUUID = UUID.randomUUID();
		// 只能打印输出文本格式的（包括html标签），不可以打印对象,客户端演示代码
//		response.getWriter().write("write=110\t" + randomUUID.toString());

		// 不仅可以打印输出文本格式的（包括html标签）
// 		response.getWriter().println(randomUUID);

		Map<String, Object> generate = null;
		if (generate == null) {
			generate = GenerateCapthca.generate();
		}

		Object value = generate.get("value");
		Object captcha = generate.get("captcha");

		System.out.println("value=" + value);
		byte[] b = captcha.toString().getBytes();
		// 向页面输出图像
		ImageIO.write((RenderedImage) captcha, "jpg", response.getOutputStream());
		response.getOutputStream().write(b);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 56;
		a[1] = 23;
		a[2] = 456;
		a[3] = 2;
		a[4] = 3;

		int[] b = new int[2];
//0-4
		for (int i = 0; i < a.length - 1; i++) { // 0-3
			System.out.print("i=" + i);
			for (int j = i + 1; j < a.length; j++) {// 1-4
				System.out.print("\t j=" + j);
			}
			System.out.println();
		}
	}
 
}

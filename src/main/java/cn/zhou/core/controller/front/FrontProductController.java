package cn.zhou.core.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/front")
@ResponseBody
public class FrontProductController {

	// 跳转前台商品展示界面 /front/product.shtml
	@RequestMapping(value = "/product/product.shtml")
	public String product() {
		return "/product/product";
	}
}

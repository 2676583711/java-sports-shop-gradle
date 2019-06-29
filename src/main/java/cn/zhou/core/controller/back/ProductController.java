package cn.zhou.core.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 产品 controller
 * 
 */
@Controller
@RequestMapping(value = "/admin")
public class ProductController {

	// 跳转商品主页面
	@RequestMapping(value = "/frame/product_main.do") /// frame/product_main.do
	public String toMain() { // frame/product_main.do
		return "frame/product_main";
	}

	@RequestMapping(value = "/frame/product_left.do")
	public String totLeft() {
		return "frame/product_left";
	}

	// 商品展示
	@RequestMapping(value = "/product/list.do")
	public String list() {

		return "/product/list";
	}

	@RequestMapping(value = "/product/toAdd.do")
	public String toAdd() {
		return "/product/add";
	}

	// 商品添加
	@RequestMapping(value = "/product/add.do")
	public String add() {
		return "/product/add";
	}

	// 商品修改
	@RequestMapping(value = "/product/update.do")
	public String update() {
		return "/product/list";
	}

	// 单个商品删除
	@RequestMapping(value = "/product/delete.do")
	public String delete() {
		return "/product/add";
	}

	// 多个商品删除
	@RequestMapping(value = "/product/deletes.do")
	public String deletes() {
		return "/product/add";
	}

	// 跳转sku库存管理界面
	@RequestMapping(value = "/sku/list.do")
	public String sku() {
		return "/sku/list";
	}
}

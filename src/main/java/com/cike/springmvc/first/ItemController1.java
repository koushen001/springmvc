package com.cike.springmvc.first;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cike.springmvc.po.Items;

public class ItemController1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 使用静态数据将商品信息列表显示在jsp页面
		// 商品列表
		List<Items> itemsList = new ArrayList<Items>();

		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setCreatetime(new Date());
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");

		itemsList.add(items_1);
		itemsList.add(items_2);
		//转发到jsp页面
		ModelAndView modelAndView = new ModelAndView();
		//将list传到页面
		//request.setAttribute("itemsList", itemsList);
		modelAndView.addObject("itemsList",itemsList);
		//modelAndView.setViewName("WEB-INF/jsp/itemsList.jsp");
		modelAndView.setViewName("itemsList");
		return modelAndView;
	}

}

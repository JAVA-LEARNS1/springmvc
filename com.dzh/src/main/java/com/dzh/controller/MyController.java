package com.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller创建控制器（处理器）
@Controller
public class MyController {
/*
 * 处理用户提交的请求，springmvc中使用方法来处理 
 * 方法是自定义的
 * @RequestMapping:来作为请求和方法的绑定
 * 返回值ModelAndView
 * Mode :数据
 * View:视图
 */
	@RequestMapping("/Hi")
	public ModelAndView SayHi() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Hello World");
		//mv.setViewName("/show.jsp");
		//mv.setViewName("/WEB-INF/view/show.jsp");
		//当配置了视图解析器后，可以使用逻辑名称(文件名)，指定视图
		//框架会使用视图解析器的 前缀 + 名称 + 后缀
		mv.setViewName("show");
		return mv;
	}
}

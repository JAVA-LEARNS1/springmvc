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
		mv.setViewName("/show.jsp");
		return mv;
	}
}

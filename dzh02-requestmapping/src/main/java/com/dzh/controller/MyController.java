package com.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*

*可以将Hello提取出来放到类上
*@RequestMapping("/Hello")
*模块化
*/
@Controller
@RequestMapping("/Hello")
public class MyController {

	/*
	*@RequestMapping:请求映射
	*			属性：method  请求的方式。
	*			GET:RequstMethod.GET,
	*			POST:RequestMethod.POST
	*		如果方式错误返回405
	*           可以不指定，这样无论post还是get方式都可以进入到方法中
	*/
	//指定get请求方式
	//@RequestMapping("/Hello/Hi")
	@RequestMapping(value="/Hi",method = RequestMethod.GET)
	public ModelAndView SayHi() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Hello World");
		mv.setViewName("show");
		return mv;
	}
	//指定post请求方式
	//@RequestMapping("/Hello/Yes")
	@RequestMapping(value="/Yes",method=RequestMethod.POST)
	public ModelAndView SayYes() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "yes");
		mv.setViewName("showYes");
		return mv;
	}
	
}

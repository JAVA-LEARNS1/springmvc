package com.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dzh.vo.Student;

/*

*可以将Hello提取出来放到类上
*@RequestMapping("/Hello")
*模块化
*/
@Controller
public class MyController {

	/*
	 *	逐个接收参数：
	 *	规则：处理器方法中的形参名和请求中的参数名必须一致
	 *
	 *	框架接收参数
	 *	1，使用request对象接收参数
	 *		String strname=request.getParameter("name");
	 *		String strage=request.getParameter("age");
	 *	2,springmvc框架通过中央调度器DispatchServlet调用SayHi()这个方法
	 *	按名称把值付给形参
	 *	SayHi(strname,Integer.valueOf(strage))框架提供类型转换
	 *	当提交的age是null时会报错，此时可以将int变成Integer类型
	 *
	 *
	 *	@RequestParam: 解决请求中参数名和形参名不一致的情况
	 *		属性： 1 value 请求的参数名
	 *			2 required 是一个boolean 默认是true
	 *				true:表示参数必须有
	 *				false：表示参数可以无
	 *
	 *		位置： 在处理器方法的形参定义的前面
	 */
	@RequestMapping(value="/receive",method=RequestMethod.POST)
	public ModelAndView SayHi(@RequestParam(value = "rname",required = false)String name,int age) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.setViewName("show");
		return mv;
	}
	
	/**
	 * 处理器方法，形参是java对象
	 * 框架会创建形参的对象Student，给Student属性赋值。请求中的参数是name，框架会调用SetName()
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/receive1",method=RequestMethod.POST)
	public ModelAndView SayHi1(Student st) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", st.getName());
		mv.addObject("age", st.getAge());
		mv.setViewName("show");
		return mv;
	}

}

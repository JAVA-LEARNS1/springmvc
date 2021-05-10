package com.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller��������������������
@Controller
public class MyController {
/*
 * �����û��ύ������springmvc��ʹ�÷��������� 
 * �������Զ����
 * @RequestMapping:����Ϊ����ͷ����İ�
 * ����ֵModelAndView
 * Mode :����
 * View:��ͼ
 */
	@RequestMapping("/Hi")
	public ModelAndView SayHi() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Hello World");
		//mv.setViewName("/show.jsp");
		//mv.setViewName("/WEB-INF/view/show.jsp");
		//����������ͼ�������󣬿���ʹ���߼�����(�ļ���)��ָ����ͼ
		//��ܻ�ʹ����ͼ�������� ǰ׺ + ���� + ��׺
		mv.setViewName("show");
		return mv;
	}
}

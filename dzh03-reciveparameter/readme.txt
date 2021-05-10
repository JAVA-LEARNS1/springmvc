dzh03-reciveparameter：接收请求的参数
接收请求参数，使用的处理器方法中的形参
1)HttpServletRequest
2)HttpServletResponse
3)HttpSession
4)用户提交的数据

接收用户提交的参数
1，逐个接收
2，对象接收

参数有中文时 
get方式没有问题，会显示的传给后台
post会出现乱码，使用过滤器处理乱码

过滤器可以自定义，也可以使用框架中提供的过滤器 CharacterEncodingFilter
web.xml声明过滤器





需求：用户在页面发一个请求，请求交给springmvc的控制器，
显示请求的处理结果（helloworld）

实现步骤：
1，新建maven工程
2，导入依赖包
     spring-webmvc 依赖，（会把其他相关依赖自动加载进来）
      jsp,servlet依赖
3，重点：在web.xml中注册springmvc框架的核心对象DispatcherServlet
          1)DispatcherServlet叫做中央调度器，是一个servlet,它的父类是继承HttpServlet
          2)DispatcherServlet也叫做前端控制器（front controller）
          3)DispatcherServlet负责接收用户提交的请求，调用其他控制器对象，并把请求的处理结果显示给用户
4，创建一个发起请求的页面 index.jsp
5,创建控制器类
   1）在类的上面加@Controller注解，创建对象，并放入到springmvc容器中(要想@Controller对象被创建就需要下面的扫描器)
   2）在类中的方法上面加入@RequestMapping注解。

6，创建一个作为结果的jsp，显示请求的处理结果。
7，创建springmvc的配置文件（spring的配置文件）
  1）声明组建扫描器，指定@Controller注解所在的包名
  2）声明视图解析器，帮组处理视图。
  
  
创建过程  
配置web.xml->指定servlet和对应的配置文件（扫描器）->  创建index.jsp->创建处理器Controller MyController.java->springmvc.xml声明扫描器

处理流程
用户访问url http://localhost:8080/com.dzh/Hi-》tomcat（tomcat读取web.xml  url-pattern 对应找到DispacherServlet）->DsipacherServlet(读取spingmvc.xml 扫描Controller)
->MyController类中处理返回页面




http://localhost:8080/dzh02-requestmapping/Hello/Hi
http://localhost:8080/dzh02-requestmapping/Hello/Yes

Mycontroller中可以
	@RequestMapping("/Hello/Hi")
	public ModelAndView SayHi() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Hello World");
		mv.setViewName("show");
		return mv;
	}
	@RequestMapping("/Hello/Yes")
	public ModelAndView SayYes() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "yes");
		mv.setViewName("showYes");
		return mv;
	}




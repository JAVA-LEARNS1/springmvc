dzh01-hello-springmvc:第一个springmvc项目。
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
   1）在类的上面加@Controller注解，创建对象，并放入到springmvc容器中
   2）在类中的方法上面加入@R恩确实他Mapping注解。

6，创建一个作为结果的jsp，显示请求的处理结果。
7，创建springmvc的配置文件（spring的配置文件）
  1）声明组建扫描器，指定@Controller注解所在的包名
  2）声明视图解析器，帮组处理视图。
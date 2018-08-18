Spring MVC
* Spring MVC概述:
    * Spring MVC是Spring提供的一个web层框架 ,基于MVC设计思想,采用解耦合,可插拔的组件结构,相比其他mvc框架(Structs,WebWork)更具扩展性和灵活性
      主要通过一套MVC注解,让pojo称为处理请求的处理器,无序实现任何接口,同时他支持REST风格的URL请求注解驱动.
    *他在视图解析,数据绑定,本地化处理及静态资源处理上表现非凡.
    * MVC模式 (一种web层的设计模式)
        mvc及model view controller 模型,视图,控制.一种设计典范,将业务逻辑,与视图 数据分离开来
*Spring MVC核心组件
       * DispatcherServlet :前端控制器,整个程序的控制中心.控制其他组件,统一调度,降低组件之间耦合性.提高组件的扩展性.
       * HandleMapping :透过扩展处理器映射器实现不同的映射方式.
       * HandleAdapter :扩展处理器适配器,支持多类型处理器
       * ViewResolver :视图解析器 支持多类型的视图解析.
       
 **简述一下Spring MVC的执行流程
    首先,客户端发出http请求,web服务器接收请求后,会通过DispatcherServlet处理用户的请求.
    此时,DispatcherServlet会先发出一个请求查找目标Handler到handleMapping 找到后会返回一个执行链请求执行目标handler
    先到处理器适配器在通过处理器返回一个ModelAndView(包含了模型数据信息,视图逻辑名) 给DispatcherServlet 
    当DispatcherServlet 接收到ModelAndView后 发给ViewResolver 去解析.
    得到解析后的信息后进行视图渲染最终发送到客户端
    DispatcherServlet------>handleMapping----->HandleAdapter----->DispatcherServlet---->ViewResolver--->客户端
    
    
      
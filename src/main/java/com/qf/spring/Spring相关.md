Spring

* 简单介绍Spring框架
    * Spring是一个活跃开源框架,基于IoC和AOP来构架多层javaEE系统,来分离项目之间的依赖关系.它主要目的就是简化企业开发.
* Spring的优点
    * 方便解耦,简化开发
    * AOP编程的支持 Spring的面向切面的编程,可以方便的对程序执行监控,权限拦截等操作
    * 声明式事务的支持 只需要通过配置就可以实现对事物的管理,无序手动编程 transactionManager
    * 方便程序的测试 
    * 方便集成各种优秀框架
    * 降低API的使用难度
 * Spring的核心模块
    Spring-core: Spring框架的核心工具类.其他组件都需要依赖这个包里的类
    Spring-context :Spring的扩展包
    Spring-beans:IoC/DI相关操作需要使用这个包中的类
    Spring-context-support:
    Spring-expression:Spring表达式语言
    
  * 什么是IoC?
        IoC就是控制反转,是降低对象之间耦合关系的一种思想.通过IoC开发人员不需要关心对象的创建过程,将创建对象的权利交给Spring容器
    完成,具体过程就是程序读取Spring配置文件,创建需要的对象
        **通过反射的机制来获取对象**
        缺点:正是因为通过反射来创建对象,这也使得对系统的性能产生一定影响
        
   * 什么是DI?
        DI就是依赖注入,创建对象的同时为这个对象注入它所依赖的属性
        其实DI就是Ioc的别名.所谓依赖注入就是Ioc在运行期间动态的将某种关系注入到对象之中.所以说Di与Ioc是从不同的角度描述同一件事.
        就是引入IoC容器,通过依赖注入方式实现对象之间解耦合.
 
 
 * bean标签
    bean标签是beans标签内部必须包含的标签,他是用于声明具体类的对象
    属性如下:
    class   :bean对应的全限定名
    name    :bean标签的名字
    scope   :指定创建方式和生命周期    scope=singleton 默认单利  scope=prototype 多利
    id      :唯一的标识符
    lazy-init:是否延时加载,默认false
    init-method:初始方法
    destory:销毁方法
    
    
 * 代码解析
    IoC
    * DI(依赖注入)
        *set注入: 
                1):基本类型的值注入使用 value
                2):引用类型注入使用ref
        *构造函数注入:
                1)单个有参构造方法注入
                2)index属性注入.按参数索引注入
                3)type属性注入
        *P命名空间注入
                1)基本类型 P:属性名="值"
                2)引入类型 P:属性名-ref="值"
        *spel注入
        *复杂类型注入
        
 * 使用注解的方式完成IoC
        需要spring-context,spring-core,spring-beans,spring-context-support,spring-aop相关包
        
 
 * 什么是AOP?
    * AOP即面向切面编程,是OOP的补充和完善.主要作用分离核心关注点和横切关注点
        Aop把软件系统分为两部分(1)核心关注:业务处理的主要流程
                             (2)横切关注点:与业务关系不大的
         主要在事务,日志,权限认证等
    * 主要包括
        * 连接点
        * 切点
        * 切面
        * 增强
        * 织入
        
 * SpringAOP底层使用两种代理机制
       * JDk的动态代理:针对实现了接口的类产生代理
       * cglib动态代理:针对没有实现接口的类产生代理,应用的底层是字节码增强技术,生成当前类的子类对象
 
 
        
        
                  
                
            
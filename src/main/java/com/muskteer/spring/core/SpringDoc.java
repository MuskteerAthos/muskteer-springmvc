package com.muskteer.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * <p>Spring 是个java企业级应用的开源开发框架<p/>
 * <p>1.轻量：Spring 是轻量的，基本的版本大约2MB。<p/>
 * <p>2.控制反转：Spring通过控制反转实现了松散耦合，对象们给出它们的依赖，而不是创建或查找依赖的对象们。<p/>
 * <p>3.面向切面的编程(AOP)：Spring支持面向切面的编程，并且把应用业务逻辑和系统服务分开。<p/>
 * <p>4.容器：Spring 包含并管理应用中对象的生命周期和配置。<p/>
 * <p>5.MVC框架：Spring的WEB框架是个精心设计的框架，是Web框架的一个很好的替代品。<p/>
 * <p>6.事务管理：Spring 提供一个持续的事务管理接口，可以扩展到上至本地事务下至全局事务（JTA）。<p/>
 * <p>7.异常处理：Spring 提供方便的API把具体技术相关的异常（比如由JDBC，Hibernate or JDO抛出的）转化为一致的unchecked 异常。<p/><hr/>
 * <p>Spring 框架基本模块<p/>
 * Core module | Bean module | Context module 
 *  Expression Language module | JDBC module | ORM module
	OXM module | Java Messaging Service(JMS) module | Transaction module
	Web module | Web-Servlet module | Web-Struts module | Web-Portlet module<p/>
 *
 */
public class SpringDoc implements BeanFactoryAware{

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}

}

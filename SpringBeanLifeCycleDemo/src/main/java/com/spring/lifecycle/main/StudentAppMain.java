package com.spring.lifecycle.main ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lifecycle.beans.Style1SpringBean;
import com.spring.lifecycle.beans.Style2SpringBean;


public class StudentAppMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Style 1
		Style1SpringBean style1Bean = (Style1SpringBean) applicationContext.getBean("style1Bean") ;
		style1Bean.beanMethod(); 
		
		// Style 1
		Style2SpringBean style2Bean = (Style2SpringBean) applicationContext.getBean("style2Bean") ;
		style2Bean.myServiceMethod();;
		((ConfigurableApplicationContext)applicationContext).close();
		
		((ConfigurableApplicationContext)applicationContext).close();
	}

}

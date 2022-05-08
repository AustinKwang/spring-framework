package com.spring.debug;

import com.spring.debug.component.aop.AopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author startspring
 * @Description
 * @Date 10/11/21 12:42 AM
 */
public class startspring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = getApplicationContext();
//		MyCalculator myCalculator = applicationContext.getBean(MyCalculator.class);
//		System.out.println(myCalculator.add(1, 6));
//		((AnnotationConfigApplicationContext)applicationContext).register();
//		((AnnotationConfigApplicationContext)applicationContext).refresh();
//		Aservice aservice = applicationContext.getBean(Aservice.class);
//		aservice.doA();
		AopService aopService = applicationContext.getBean(AopService.class);
		aopService.doSt();
	}

	private static ApplicationContext getApplicationContext() {
		ApplicationContext applicationContext = null;
//        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext = new ClassPathXmlApplicationContext("application.xml");
		return applicationContext;
	}
}

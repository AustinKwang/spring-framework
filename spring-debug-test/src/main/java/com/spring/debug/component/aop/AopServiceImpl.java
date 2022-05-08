package com.spring.debug.component.aop;

import com.spring.debug.component.Aservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author austin
 * @Description
 * @Date 5/8/22 10:19 PM
 */
@Component
public class AopServiceImpl implements AopService{

	@Autowired
	Aservice aservice;

	@Override
	public void doSt() {
		System.out.println("start aop service doSt");
		aservice.doA();
		System.out.println("ent aop service doSt");
	}
}

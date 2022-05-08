package com.spring.debug.component.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author austin
 * @Description
 * @Date 5/8/22 9:52 PM
 */
@Aspect
public class AspectJDemo {

	@Pointcut("execution(* com.spring.debug.component.*.*(..))")
	private void point(){};

	@Before("point()")
	public void before(JoinPoint joinPoint){
		System.out.println("带租客看房");
		System.out.println("谈价格");
	}

	@After("point()")
	public void after(JoinPoint joinPoint){
		System.out.println("交钥匙");

	}

	@Around("point()")
	public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("start around...");
		joinPoint.proceed();
		System.out.println("end around...");
	}
}

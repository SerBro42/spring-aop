package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.in28minutes.spring.aop.spring_aop.data.*.*(..))")
	public void dataLayerExecution() {

	}
	
	@Pointcut("execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))")
	public void businessLayerExecution() {

	}

}

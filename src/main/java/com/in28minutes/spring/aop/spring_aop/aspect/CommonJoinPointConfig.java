package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.in28minutes.spring.aop.spring_aop.data.*.*(..))")
	public void dataLayerExecution() {

	}
	
	@Pointcut("execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))")
	public void businessLayerExecution() {

	}

	//Pointcut that includes both the above
	@Pointcut("com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecution() "
			+ "&& com.in28minutes.spring.aop.spring_aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void allLayerExecution() {
		
	}
	
	//Pointcut that includes any bean that includes the word 'dao'
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {
		
	}
	
	//Pointcut that includes any directory that includes the specified string
	@Pointcut("within(com.in28minutes.spring.aop.spring_aop.data..*)")
	public void dataLayerExecutionWithWithin() {
		
	}
}

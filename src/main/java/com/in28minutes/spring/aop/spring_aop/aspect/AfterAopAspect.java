package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//The @After annotation means that this method takes place AFTER the method is invoked, regardless of the result of the execution.
	@After(value="execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		//Shows the entire method that's being intercepted
		logger.info("After execution of {}", joinPoint);
	}
	
	//The @AfterReturning annotation means that this method takes place AFTER target method invocation, but only if it's successful.
	@AfterReturning(value="execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		//Shows the entire method that's being intercepted
		logger.info("AfterReturning {} returned with value {}", joinPoint, result);
	}
	
	//@AfterThrowing is called upon after execution of target method, but only if it returns an exception.
	@AfterThrowing(value="execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))",
			throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		//Shows the entire method that's being intercepted
		logger.info("{} returned with value {}", joinPoint, exception);
	}

}

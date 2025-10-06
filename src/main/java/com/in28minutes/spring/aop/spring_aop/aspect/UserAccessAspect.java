package com.in28minutes.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls would I want to intercept?
	//Meaning of the parameter: Intercept ALL methods irrespective of their return type, in a specific PACKAGE, any class, all method calls, irrespective of their arguments
	//execution(* PACKAGE.*.*(..))
	
	//The @Before annotation means that this method takes place BEFORE the actual method is invoked.
	//Used for example for security checks: access check for the user before executing any of the methods of this application.
	@Before("execution(* com.in28minutes.spring.aop.spring_aop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//Shows the entire method that's being intercepted
		logger.info(" Check for user access ");
		logger.info(" Authorised execution for {}", joinPoint);
	}

}

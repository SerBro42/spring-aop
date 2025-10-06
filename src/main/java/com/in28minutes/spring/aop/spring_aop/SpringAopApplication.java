package com.in28minutes.spring.aop.spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring.aop.spring_aop.business.Business1;
import com.in28minutes.spring.aop.spring_aop.business.Business2;

//In Spring Core, we used to define a local variable for applicationContext in order to instantiate the beans we need. 
//In Spring Boot we can implement CommandLineRunner to do the same thing, using its run() method. This interface is useful
//for tasks that need to run only once during the application's lifecycle, such as initializing a database, loading configuration 
//data, or executing startup logic.
@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}

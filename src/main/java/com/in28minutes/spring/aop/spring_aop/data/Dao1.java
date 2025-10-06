package com.in28minutes.spring.aop.spring_aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String retrieveSomething() {
		return "Dao1";
	}

}

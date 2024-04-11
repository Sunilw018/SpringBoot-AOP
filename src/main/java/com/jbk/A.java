package com.jbk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {

	@Value("${customerId}")
	int id;

	@RequestMapping("/aop")
	public void name() {
		System.out.println(id);
	}
}

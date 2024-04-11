package com.jbk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {

	@Value("${customerId}") //Application.properties chi value access kara satu ahe
	int id; // application.properties chi value use karasati

	@RequestMapping("/aop")
	public void name() {
		System.out.println(id);
	}
}

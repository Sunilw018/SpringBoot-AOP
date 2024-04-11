package com.jbk;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceProvider {

	@Before("execution (* com.jbk.A.name())")
	public void msgProjectStarted() {
		System.err.println("Project Started ... ");
	}

	@After("execution (* com.jbk.A.name())")
	public void msgProjectEnded() {
		System.err.println("Project Ended ... ");
	}
}

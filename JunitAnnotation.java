package com.kota;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class JunitAnnotation {

	@Test
	public void test1() {
		System.out.println("in test1");
	}
	
	@Test
	public void test2() {
		System.out.println("in test2");
	}
	
	@Before
	public void beforetest(){
		System.out.println("Before executing Test method");
	}
	
	@After
	public void aftertest(){
		System.out.println("After executing Test method");
	}

	
	@BeforeClass
	public static void beforeclass(){
		System.out.println("Before executing any Test methods");
	}
	
	@AfterClass
	public static void afterclass(){
		System.out.println("After executing all Test methods");
	}
	
	
	
}

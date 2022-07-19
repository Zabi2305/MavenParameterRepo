package com.tyss.sangamesh.datadriventesting;

import org.testng.annotations.Test;

public class TestngTest {

	@Test
	public void testCase1Test() {
		String browser = System.getProperty("browser");
		String userName = System.getProperty("username");
		 
		
		
		
		System.out.println(userName);
		
		
	}
	
	@Test
	public void testCase2Test() {
		System.out.println("test case 2");
	}
	
	@Test
	public void testCase3Test() {
		System.out.println("test case 3");
	}
	
	@Test
	public void testCase4Test() {
		System.out.println("test case 4");
	}
}

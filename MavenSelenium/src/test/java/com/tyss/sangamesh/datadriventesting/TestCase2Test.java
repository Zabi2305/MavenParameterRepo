package com.tyss.sangamesh.datadriventesting;

import org.testng.annotations.Test;

public class TestCase2Test {

	@Test(priority=5)
	public void lionTest() {
		System.out.println("Lion Is The King of Forest");
	}
	@Test(priority=-1)
	public void elephentTest() {
		System.out.println("Elephent is the king of forest");
	}
	@Test(priority=3)
	public void tigerTest() {
		System.out.println("Tiger is the king of forest");
	}
	@Test(priority=2)
	public void monkeyTest() {
		System.out.println("Monkey is the king of forest");
	}
	@Test(priority = 0)
	public void dogTest() {
		System.out.println("Dog is the king of forest");
	}
	@Test(priority=1)
	public void rabbitTest() {
		System.out.println("Rabbit is the king of forest");
	}
}

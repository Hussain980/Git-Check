package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoTest {
	
	@Test
	void demoTest() {
		
		System.out.println("Test running ");
		Assertions.assertEquals("Hussain", "Hussain");
		Assertions.assertEquals("Hussai", "Hussain","Test failed - not equals");
	}
	
	
	/*
	 * @Test void demoTest2() {
	 * 
	 * System.out.println("Test running "); Assertions.assertEquals("Hussain",
	 * "Hussain","Test failed - not equals"); }
	 */

}

package com.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddTest {
	Calculator c = new Calculator();
  @Test
  public void f() {
	  System.out.println("Hello Test");
  }
  
  @Test(dataProvider = "provideNumbers")
	public void test(int a, int b) {
		Assert.assertEquals((a+b), c.add(a,b));
	}

	@DataProvider(name = "provideNumbers")
	public Object[][] provideData() {

		return new Object[][] { 
			{ 1, 1 }, 
			{ 2, 6 }, 
			{ 20, 42 },
			{ 12, 14 }, 
			{ 0, 0 } 
		};
	}
}

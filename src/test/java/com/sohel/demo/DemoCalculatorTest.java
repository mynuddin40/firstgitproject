package com.sohel.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoCalculatorTest {

	@Test
	public void testAddition() {
    DemoCalculator obj=new DemoCalculator();
    int res=obj.addition(9, 3);
    assertEquals(12, res);
	}
	@Test
	public void testAddition1() {
    DemoCalculator obj=new DemoCalculator();
    int res=obj.addition(-9, 3);
    assertEquals(-6, res);
	}
	@Test
	public void testAddition2() {
    DemoCalculator obj=new DemoCalculator();
    int res=obj.addition(9, -3);
    assertEquals(6, res);
	}
	@Test
	public void testAddition3() {
    DemoCalculator obj=new DemoCalculator();
    int res=obj.addition(-9, -3);
    assertEquals(-12, res);
	}
}

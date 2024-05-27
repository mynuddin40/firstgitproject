package com.sohel.demo;

public class DemoCalculator {
	
   public int addition(int a,int b) {
	   return a+b;
   }
 public static void main(String[] args) {
	DemoCalculator obj=new DemoCalculator();
	int res=obj.addition(9, 3);
	System.out.println(res);
}
}

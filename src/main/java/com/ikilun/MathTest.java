package com.ikilun;

import org.junit.Test;

public class MathTest{
	@Test
	public void testMath1(){
		System.out.println(Math.round(12.5D));  //13
		System.out.println(Math.round(-12.5D)); //-12
		
		System.out.println(Math.floor(12.6)); //12
		System.out.println(Math.floor(-12.6));//-13
		
		float a = 3.4F;
	}
}

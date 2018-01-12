package com.ikilun;

import org.junit.Test;

import junit.framework.Assert;

public class MathTest{
	@Test
	public void testMath1(){
		System.out.println(Math.round(12.5D));  //13
		System.out.println(Math.round(-12.5D)); //-12
		
		System.out.println(Math.floor(12.6)); //12
		System.out.println(Math.floor(-12.6));//-13
		
		float a = 3.4F;
		Assert.assertEquals(1, 1);
	}
	
	
	@Test
	public void testValueOf(){
		//Integer.valueOf返回一个Integer对象，默认在-128~127之间时返回缓存中的已有对象（如果存在的话）
		Integer a = Integer.valueOf("-128");
		Integer b = Integer.valueOf("-128");
		System.out.println(a==b);
		
		Integer c = Integer.valueOf("128");
		Integer d = Integer.valueOf("128");
		System.out.println(c==d);
	}
}

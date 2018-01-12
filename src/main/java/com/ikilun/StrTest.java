package com.ikilun;

public class StrTest {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "he"+new String("llo");
		System.out.println(s1==s2);//false
	}
}

package com.ikilun;

public class ChangeTest {
	public static void changeStr(String str) {
		str = "123";
	}

	public static void main(String[] args) {

		String str = "abc";
		changeStr(str);
		System.out.println(str);
	}

}

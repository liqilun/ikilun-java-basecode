package com.ikilun;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList("a", "b", "c" , "d"));
		for(int i=0;i<strList.size();i++){
			System.out.println(strList.remove(i)+","+strList.size()+",="+strList);
		}
		System.out.println(strList);
	}
	public void ArraysTest(){
		
	}
}

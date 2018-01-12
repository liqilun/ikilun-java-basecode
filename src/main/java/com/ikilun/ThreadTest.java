package com.ikilun;

public class ThreadTest {
	public static void xx(){
		System.out.println("======111");
	}
	public static void yy(){
		System.out.println("======333");
	}
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				xx();
			}
		}).start();
		System.out.println("======222");
	}
}

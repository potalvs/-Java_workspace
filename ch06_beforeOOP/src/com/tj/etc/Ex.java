package com.tj.etc;

import co.tj.method.Sansu;
//패키지가 다르면 클래스 를 호출할때 import를 해줘야함. 
public class Ex {
	public static void main(String[] args) {
		Sansu san = new Sansu();
		int sum = san.sum(1,10);
		System.out.println("누적합"+sum);
	}
}

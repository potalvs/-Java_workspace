package com.tj.op;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======3항 연산자(? :)======★");
		
		
		int h=0;
		System.out.println("정수를 입력하세요 ");
		sc.nextLine();
		String result = (h%2==0)? "h는짝수" : "h는홀수";
		System.out.println(result);
		
		System.out.println("정수를입력하세요 ");
		sc.nextLine();
		System.out.println((h%2==0)? "h는짝수":"h는 홀수");
		
		sc.close();
	}
}

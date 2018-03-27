package com.tj.example;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int i =sc.nextInt();	
		System.out.println((i%3==0)? "3의배수입니다":"3의배수가아닙니다");
		
		sc.close();
		
		
		
		
	}
}

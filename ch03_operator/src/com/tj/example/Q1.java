package com.tj.example;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int i =sc.nextInt();
		
		String result = (i%2==0)? "입력하신수는 짝수네요":"입력하신수는 홀수네요";
		
		System.out.println(result);
		
		
		sc.close();
		
		

	}

}

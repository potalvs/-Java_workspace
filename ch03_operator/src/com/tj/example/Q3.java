package com.tj.example;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		System.out.println("정수가 같으면 o 다르면 x");
		
		System.out.println("첫번째 정수를 입력하세요");
		i=sc.nextInt();
		
		System.out.println("두번쨰 정수를 입력하세요");
		j=sc.nextInt();
		
		System.out.println((i==j)?"O":"X");
		
		sc.close();

	}

}

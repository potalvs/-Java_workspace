package com.tj.example;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("나이를 입력하세요 65세 이상이면 경로 우대 사항입니다. ");
		 i = sc.nextInt();
		 
		 System.out.println((i>=65)?"경로우대사항입니다.":"우대사항이 아닙니다.젊으시네요..");
		
		 sc.close();
	}
}

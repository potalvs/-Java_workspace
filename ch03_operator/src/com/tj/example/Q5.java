package com.tj.example;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("주민번호 7째 자리를 입력해주세요 남 여 인지 구분하겠습니다.7번쨰 자리를 입력해주세요(1,3은남자 2,4는여자입니다.)");
		i=sc.nextInt();
		
		System.out.println((i==1||i==3)?"성별은남자입니다":"성별은 여자입니다.");
		
		sc.close();
	}
}

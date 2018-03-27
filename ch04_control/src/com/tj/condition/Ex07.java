package com.tj.condition;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("나 : 가위 바위 보 !");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("가위(0) 바위(1) 보(2) 중 하나만 입력해주세요");
		int na =sc.nextInt();
		
		if(na==0) {
			System.out.println("가위");
		}else if(na==1) {
			System.out.println("바위");
		}else if(na==2) {
			System.out.println("보 ");
		}else {
			System.out.println("잘못된 값 입력입니다. 다시 입력해주세요 ");
		}
		
		sc.close();
	}
}

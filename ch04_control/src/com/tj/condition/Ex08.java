package com.tj.condition;

import java.util.Scanner;

// na 와 computer 가 가위바위보를 내서 누가이겼는지 같이 출력 
// na 는 뭘냈고 , computer는 뭘 냈는지 같이 출력 
public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======컴퓨터vs나=======");
		System.out.println("==========================================");

		System.out.println("!!!!!!!!!!컴퓨터::가위(0) 바위(1) 보(2)!!!!!!!!!!!!!");
		int computer =(int)(Math.random()*3);
		
		if(computer==0) {
			System.out.println("===가위===");
		}else if (computer==1) {
			System.out.println("===바위===");
		}else if(computer==2) {
			System.out.println("===보===");
		}else {
			System.out.println("잘못된 값입니다 . 다시 실행해주세요");
		}
		
		System.out.println("!!!!!!!!!나 :: 가위(0),바위(1),보(2)중에 눌러주세요!!!!!!!!!!!!!!");
		int na = sc.nextInt();
		
		if(na==0) {
			System.out.println("===가위===");
		}else if(na==1) {
			System.out.println("===바위===");
		}else if(na==2) {
			System.out.println("===보===");
		}else {
			System.out.println("다른 값입니다 다시 실행해 주세요 ");
		}
		System.out.println("!!!!!!!!!!!!승부결과!!!!!!!!!!!!!!!");
		if((na+2)%3==computer) {
			System.out.println("내가이겼다");
		}else if(na==computer) {
			System.out.println("비겼어 ㅜㅜ");
		}else {
			System.out.println("내가 졌다......");
		}
	}
}

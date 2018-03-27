package com.tj.condition;

import java.util.Scanner;

// 가위(0) , 바위(1) , 보 (2) 중 하나의 난수를 발생한다. 
public class Ex06 {
	public static void main(String[] args) {
		//  0<=Math.random()<1   소수이다.
		//  0<=Math.randon()*3 <3
		System.out.println("나 vs컴퓨터");
		System.out.println("====================================");
		System.out.println("컴퓨터 가위 바위 보!");
		int computer = (int)(Math.random()*3); // 괄호 꼭 쳐주자
		/*computer = (int)Math.random()*3; 이렇게 하면 0만 나온다 */
		if(computer==0) {
			System.out.println("=============가위===========");
		}else if(computer==1) {
			System.out.println("=============바위=========");
		}else if(computer==2) {
			System.out.println("==============보자기========");
		}else {
		
		}
		
		System.out.println("나 : 가위 바위 보 !");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("가위(0) 바위(1) 보(2) 중 하나만 입력해주세요");
		int na =sc.nextInt();
		
		if(na==0) {
			System.out.println("===============가위==============");
		}else if(na==1) {
			System.out.println("================바위==============");
		}else if(na==2) {
			System.out.println("================보============== ");
		}else {
			System.out.println("잘못된 값 입력입니다. 다시 입력해주세요 ");
		}
		
		System.out.println("==================승부결과====================");
		if((na+2)%3==computer) {
			System.out.println("내가이겼다");
		}else if(na==computer) {
			System.out.println("비겼어 ㅜㅜ");
		}else {
			System.out.println("내가 졌다......");
		}
	}

}

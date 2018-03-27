package com.tj.condition;

import java.util.Scanner;

// 수를 입력받아 절대값 출력
/* 5->5
 * 
 * -5 -> -(-5)
 * 
 * 
 * */
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력 하세요");
		int i = sc.nextInt();
		
		if(i>=0) {
			System.out.println("입력한 값 ("+i+")의 절대값:");
		}else {
			System.out.println("입력한 값 ("+i+")의 절대값은" +(-i));
		}
		sc.close();
	}
}

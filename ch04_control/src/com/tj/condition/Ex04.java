package com.tj.condition;

import java.util.Scanner;

// ���� �Է¹޾� ���밪 ���
/* 5->5
 * 
 * -5 -> -(-5)
 * 
 * 
 * */
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� �ϼ���");
		int i = sc.nextInt();
		
		if(i>=0) {
			System.out.println("�Է��� �� ("+i+")�� ���밪:");
		}else {
			System.out.println("�Է��� �� ("+i+")�� ���밪��" +(-i));
		}
		sc.close();
	}
}

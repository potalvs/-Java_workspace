package com.tj.condition;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("�� : ���� ���� �� !");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("����(0) ����(1) ��(2) �� �ϳ��� �Է����ּ���");
		int na =sc.nextInt();
		
		if(na==0) {
			System.out.println("����");
		}else if(na==1) {
			System.out.println("����");
		}else if(na==2) {
			System.out.println("�� ");
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�. �ٽ� �Է����ּ��� ");
		}
		
		sc.close();
	}
}

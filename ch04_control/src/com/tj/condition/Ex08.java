package com.tj.condition;

import java.util.Scanner;

// na �� computer �� ������������ ���� �����̰���� ���� ��� 
// na �� ���°� , computer�� �� �´��� ���� ��� 
public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======��ǻ��vs��=======");
		System.out.println("==========================================");

		System.out.println("!!!!!!!!!!��ǻ��::����(0) ����(1) ��(2)!!!!!!!!!!!!!");
		int computer =(int)(Math.random()*3);
		
		if(computer==0) {
			System.out.println("===����===");
		}else if (computer==1) {
			System.out.println("===����===");
		}else if(computer==2) {
			System.out.println("===��===");
		}else {
			System.out.println("�߸��� ���Դϴ� . �ٽ� �������ּ���");
		}
		
		System.out.println("!!!!!!!!!�� :: ����(0),����(1),��(2)�߿� �����ּ���!!!!!!!!!!!!!!");
		int na = sc.nextInt();
		
		if(na==0) {
			System.out.println("===����===");
		}else if(na==1) {
			System.out.println("===����===");
		}else if(na==2) {
			System.out.println("===��===");
		}else {
			System.out.println("�ٸ� ���Դϴ� �ٽ� ������ �ּ��� ");
		}
		System.out.println("!!!!!!!!!!!!�ºΰ��!!!!!!!!!!!!!!!");
		if((na+2)%3==computer) {
			System.out.println("�����̰��");
		}else if(na==computer) {
			System.out.println("���� �̤�");
		}else {
			System.out.println("���� ����......");
		}
	}
}

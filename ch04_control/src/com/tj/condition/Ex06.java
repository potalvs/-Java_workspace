package com.tj.condition;

import java.util.Scanner;

// ����(0) , ����(1) , �� (2) �� �ϳ��� ������ �߻��Ѵ�. 
public class Ex06 {
	public static void main(String[] args) {
		//  0<=Math.random()<1   �Ҽ��̴�.
		//  0<=Math.randon()*3 <3
		System.out.println("�� vs��ǻ��");
		System.out.println("====================================");
		System.out.println("��ǻ�� ���� ���� ��!");
		int computer = (int)(Math.random()*3); // ��ȣ �� ������
		/*computer = (int)Math.random()*3; �̷��� �ϸ� 0�� ���´� */
		if(computer==0) {
			System.out.println("=============����===========");
		}else if(computer==1) {
			System.out.println("=============����=========");
		}else if(computer==2) {
			System.out.println("==============���ڱ�========");
		}else {
		
		}
		
		System.out.println("�� : ���� ���� �� !");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("����(0) ����(1) ��(2) �� �ϳ��� �Է����ּ���");
		int na =sc.nextInt();
		
		if(na==0) {
			System.out.println("===============����==============");
		}else if(na==1) {
			System.out.println("================����==============");
		}else if(na==2) {
			System.out.println("================��============== ");
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�. �ٽ� �Է����ּ��� ");
		}
		
		System.out.println("==================�ºΰ��====================");
		if((na+2)%3==computer) {
			System.out.println("�����̰��");
		}else if(na==computer) {
			System.out.println("���� �̤�");
		}else {
			System.out.println("���� ����......");
		}
	}

}

package com.tj.example;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("�ֹι�ȣ 7° �ڸ��� �Է����ּ��� �� �� ���� �����ϰڽ��ϴ�.7���� �ڸ��� �Է����ּ���(1,3������ 2,4�¿����Դϴ�.)");
		i=sc.nextInt();
		
		System.out.println((i==1||i==3)?"�����������Դϴ�":"������ �����Դϴ�.");
		
		sc.close();
	}
}

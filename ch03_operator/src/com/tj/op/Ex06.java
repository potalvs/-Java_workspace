package com.tj.op;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======3�� ������(? :)======��");
		
		
		int h=0;
		System.out.println("������ �Է��ϼ��� ");
		sc.nextLine();
		String result = (h%2==0)? "h��¦��" : "h��Ȧ��";
		System.out.println(result);
		
		System.out.println("�������Է��ϼ��� ");
		sc.nextLine();
		System.out.println((h%2==0)? "h��¦��":"h�� Ȧ��");
		
		sc.close();
	}
}

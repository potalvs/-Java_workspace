package com.tj.example;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		System.out.println("������ ������ o �ٸ��� x");
		
		System.out.println("ù��° ������ �Է��ϼ���");
		i=sc.nextInt();
		
		System.out.println("�ι��� ������ �Է��ϼ���");
		j=sc.nextInt();
		
		System.out.println((i==j)?"O":"X");
		
		sc.close();

	}

}

package com.tj.example;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int i =sc.nextInt();
		
		String result = (i%2==0)? "�Է��Ͻż��� ¦���׿�":"�Է��Ͻż��� Ȧ���׿�";
		
		System.out.println(result);
		
		
		sc.close();
		
		

	}

}

package com.tj.condition;

import java.util.Scanner;

//�� ���� �Է¹޾� �ִ밪 , �ּҰ� �Է� 
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է��ϼ���");
		int i =sc.nextInt();
		
		System.out.println("�ι�° ������ �Է��ϼ���");
		int j =sc.nextInt();
		
		int max, min;
		if(i>j) {
			/*System.out.printf("max=%d , min=%d",i,j);*/
			max=i; min=j;
		}else if(i<j) {
			/*System.out.printf("max=%d min=%d ",j,i);*/
			max=j; min=i;
		}else {
			max =min =i;
		}
		System.out.println("�ִ밪="+max +"�ּҰ�="+min);
		sc.close();
		
	}
}

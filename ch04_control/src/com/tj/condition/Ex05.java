package com.tj.condition;

import java.util.Scanner;

/*�������� �Է¹޾� ����� �ϰ�   
 * ��������  ���� ��պ��� ������ ������ ���
 * 
 * */
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int kor;
		int mat;
		int eng;
		double avg;
	
		System.out.println("���������� �Է��ϼ���");
		kor =sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		mat =sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		eng =sc.nextInt();
		
		avg = (kor+mat+eng)/3;
		
		System.out.printf("����� %.2f\n",avg);
		
	
		
		if(avg<kor) {
			System.out.println("���������� ��պ���"+(kor-avg)+ "�� �����ϴ�.");
		}else if(avg>kor){
			System.out.println("���������� ��պ���"+(avg-kor)+ "�� �����ϴ�.");
		}else {
			System.out.println("���������� ����� �����ϴ�.");
		}
		

		if(avg<mat) {
			System.out.println("����������"+ "������ ��պ���"+(mat-avg)+ "�� �����ϴ�.");
		}else if(avg>mat){
			System.out.println("���������� ��պ���"+(avg-mat)+ "�� �����ϴ�.");
		}else {
			System.out.println("���������� ����� �����ϴ�.");
		}
		

		if(avg<eng) {
			System.out.println("���������� ��պ���"+(eng-avg)+ "�� �����ϴ�.");
		}else if(avg>eng){
			System.out.println("���������� ��պ���"+(avg-eng)+ "�� �����ϴ�.");
		}else {
			System.out.println("���������� ����� �����ϴ�.");
		}
		
	}

}

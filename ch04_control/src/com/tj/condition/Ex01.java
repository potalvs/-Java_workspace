package com.tj.condition;

public class Ex01 {
	public static void main(String[] args) {
		
		int i =10, j=20, h=30;
		
		if(i>j) {
			System.out.println("i�� j����"+(i-j)+"ũ��");
		}else if(i<j){
			System.out.println("j�� i����"+(j-i)+"ũ��");
		}else if(i==j) {
			System.out.println("i�� j�� ����");
		}
		
		if(i+j==h) {
			System.out.println("i+j �� h�Ͱ���");
		}
			
		
	}
}

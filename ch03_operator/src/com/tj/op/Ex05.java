package com.tj.op;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("��Ʈ������($, | ,<< ,>>");
		
		int n1 =10;  //0 1 0 1 0
        int n2 =5;   //0 0 1 0 1
		int result = n1 & n2;
		
		System.out.println("n1 &n2=" +result);
		result =n1 | n2; // 0 1 1 1 1
		System.out.println("n1 | n2=" +result);
		
		result =n1 << 1;// 0 1 0 1 0   //10 ������ 2�� ���Ѱ���� ���´� �������� �ϳ��� �̵� �ϴ°��� ���� . 
		System.out.println(result);
		
	}
}

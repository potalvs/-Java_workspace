package com.tj.var;

public class Ex05 {
	public static void main(String[] args) {
		int i1 =10;
		long l1 =220000000000000L;
		
		//�� ��ȯ = �������� ����ȯ + ������� ����ȯ 
		
		l1=i1; // �������� �� ��ȯ (���� �ָӴ��� �����͸� ū �ָӴϷ� ������) 
		
		System.out.println(l1);
		
		double d1 = 13.91;
		i1=(int)d1;   //ū �ָӴ��� �����͸� ���� �ָӴϷ� �ִ´� . ������� �� ��ȯ
		
		System.out.println(i1);  //System.out.println �̶�� �ٷ��̸� �������� ���� Api,���� ���̺귯�� ��� �θ���.
	}

}

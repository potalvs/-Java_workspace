package com.tj.array;

public class Ex03 {
	public static void main(String[] args) {
		//3. �迭 ����� ���� Ȯ���� �ʱ�ȭ �� ����
		
		int[] arr; //�迭 ������ ����
		
		arr = new int[3]; //�迭���� Ȯ�� 
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		for(int a :arr) {
			System.out.print(a+ "\t");
		}
	}
}

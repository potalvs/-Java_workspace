package com.tj.array;


public class Ex01 {
	public static void main(String[] args) {
		int i =10;
		int[] arr = {5,6,7};
		//int[] arr = new int[] {5,5,5};// 1. �迭 ���� :����� �ʱ�ȭ�� �����Ѵ�. 
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		for(int idx=0; idx<arr.length;idx++) {
			System.out.printf("%d��° :%d\n",idx,arr[idx]); //Ȯ�� ������ ���� index�� ���� ����������. ������ ���ؼ�
			
		}
		System.out.println();

		//Ȯ��for�� �������� ���� Ȯ�� ���� 
		for(int temp :arr) {
			System.out.println(temp + "  ");
		}
		System.out.println("=========== arr�迭�� ������ ���� �ϱ� ");
		
	/*	for(int idx=0;idx<arr.length;idx++) {
			arr[idx] =100;  
			System.out.print(arr[idx]+"  ");
			
		}*/
		for(int a : arr) {//�迭 ������ �Ϲ� for �� ��� �ؾ��ϰ� Ȯ�������� �ȵȴ� 
			a= 100;
		}
		for(int a :arr) {
			System.out.print(a +"\t");
		}
		
	}	
}

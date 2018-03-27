package com.tj.array;


public class Ex01 {
	public static void main(String[] args) {
		int i =10;
		int[] arr = {5,6,7};
		//int[] arr = new int[] {5,5,5};// 1. 배열 선언 :선언과 초기화를 같이한다. 
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		for(int idx=0; idx<arr.length;idx++) {
			System.out.printf("%d번째 :%d\n",idx,arr[idx]); //확장 포문을 쓰면 index랑 같이 쓸수가없다. 선언을 안해서
			
		}
		System.out.println();

		//확장for문 위에꺼랑 같음 확장 포문 
		for(int temp :arr) {
			System.out.println(temp + "  ");
		}
		System.out.println("=========== arr배열에 데이터 수정 하기 ");
		
	/*	for(int idx=0;idx<arr.length;idx++) {
			arr[idx] =100;  
			System.out.print(arr[idx]+"  ");
			
		}*/
		for(int a : arr) {//배열 수정시 일반 for 문 사용 해야하고 확장포문은 안된다 
			a= 100;
		}
		for(int a :arr) {
			System.out.print(a +"\t");
		}
		
	}	
}

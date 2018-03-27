package com.tj.array;

public class Ex03 {
	public static void main(String[] args) {
		//3. 배열 선언과 공간 확보와 초기화 를 따로
		
		int[] arr; //배열 변수만 선언
		
		arr = new int[3]; //배열공간 확보 
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		for(int a :arr) {
			System.out.print(a+ "\t");
		}
	}
}

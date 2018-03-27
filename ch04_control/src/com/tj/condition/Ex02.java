package com.tj.condition;

import java.util.Scanner;

//두 수를 입력받아 최대값 , 최소값 입력 
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요");
		int i =sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
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
		System.out.println("최대값="+max +"최소값="+min);
		sc.close();
		
	}
}

package com.tj.todayEx;
// iArr = {10,20,30,40,50} 배열에 담긴 값을 더하는 프로그램 
public class TodayEx1 {
	public static void main(String[] args) {
		
		int[] iArr= {10,20,30,40,50};
		
	      int sum=0;
		/*for(int a : iArr) {
			sum+= a;
			
			
		}
		System.out.println("누적합 : "+sum);*/
	
		
		for(int i =0; i<iArr.length;i++) {
			sum+=iArr[i];
		}
		System.out.println("누적합 = "+sum);
	}
}

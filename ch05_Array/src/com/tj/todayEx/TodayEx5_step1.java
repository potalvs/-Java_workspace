package com.tj.todayEx;

import java.util.Scanner;


//1단계 : 배열을 이용하여 학생들(영희 ,철수, 길동 ,영수, 말자) 의 키를 입력받아 평균출력
public class TodayEx5_step1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] name = {"영희","철수","길동","영수","말자"};
		int[] height = new int[name.length];
		
		int tot=0; double avg;
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"의 키는 ?");
			height[i]=sc.nextInt();	
			tot += height[i];
		}
		avg = (double)tot/name.length;
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"의 키:"+height[i]);
		}
		System.out.printf("키의 평균은 ?%.1f",avg);
		
		
		
	}
}

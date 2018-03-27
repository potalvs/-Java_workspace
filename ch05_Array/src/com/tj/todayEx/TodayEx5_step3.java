package com.tj.todayEx;

import java.util.Scanner;


//3단계 : 배열을 이용하여 학생들(영희 ,철수, 길동 ,영수, 말자) 의 키를 입력받아 오른차순을 정렬합니다 . 
public class TodayEx5_step3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] name = {"영희","철수","길동","영수","말자"};
		int[] height = new int[name.length];
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"의 키는 ?");
			height[i]=sc.nextInt();	
		}
	//정렬하기
		for(int i=0; i<name.length;i++) {
			System.out.println(height[i]+"("+name[i]+")  ");
		}
		for(int i =0; i<name.length; i++) {
			for(int j=i+1;j<name.length;j++) {
				if(height[i]>height[j]) {
					int tempH = height[i];
					height[i]=height[j];
					height[j]=tempH;
					String tempN =name[i];
					name[i]=name[j];
					name[j]=tempN;
				}
				
			}
		}
		System.out.println("절 렬 후 ");
		for(int i=0; i<name.length;i++) {
			System.out.println(height[i]+"("+name[i]+")  ");
		}
	}
}

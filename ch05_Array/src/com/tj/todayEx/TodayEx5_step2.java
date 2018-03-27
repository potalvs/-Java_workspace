package com.tj.todayEx;

import java.util.Scanner;


//2단계 : 배열을 이용하여 학생들(영희 ,철수, 길동 ,영수, 말자) 의 키를 입력받아 최단신과 최장신을 출력 누가최단신인지 최장신인지 이름까지 출력
public class TodayEx5_step2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] name = {"영희","철수","길동","영수","말자"};
		int[] height = new int[name.length];
		
		int max=0 ,maxIndex=0 ,min=999,minIndex=0;
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"의 키는 ?");
			height[i]=sc.nextInt();	
		}
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"의 키:"+height[i]);
		}
		//5명의 키를 height배열 방에넣음
		for(int i = 0 ; i<name.length;i++) {
			if(max<height[i]) {
				max=height[i];
				maxIndex =i;
			}
			if(min>height[i]) {
				min =height[i];
				minIndex=i;
				{
		}
		
		
		
			}
		}
		System.out.println("최장신 :"+max+"-"+name[maxIndex]+" 최단신:"+min+"-"+name[minIndex]);
	}
}

package com.tj.todayEx;

import java.util.Scanner;


//2�ܰ� : �迭�� �̿��Ͽ� �л���(���� ,ö��, �浿 ,����, ����) �� Ű�� �Է¹޾� �ִܽŰ� ������� ��� �����ִܽ����� ��������� �̸����� ���
public class TodayEx5_step2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] name = {"����","ö��","�浿","����","����"};
		int[] height = new int[name.length];
		
		int max=0 ,maxIndex=0 ,min=999,minIndex=0;
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"�� Ű�� ?");
			height[i]=sc.nextInt();	
		}
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"�� Ű:"+height[i]);
		}
		//5���� Ű�� height�迭 �濡����
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
		System.out.println("����� :"+max+"-"+name[maxIndex]+" �ִܽ�:"+min+"-"+name[minIndex]);
	}
}

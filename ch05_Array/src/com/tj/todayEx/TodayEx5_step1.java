package com.tj.todayEx;

import java.util.Scanner;


//1�ܰ� : �迭�� �̿��Ͽ� �л���(���� ,ö��, �浿 ,����, ����) �� Ű�� �Է¹޾� ������
public class TodayEx5_step1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] name = {"����","ö��","�浿","����","����"};
		int[] height = new int[name.length];
		
		int tot=0; double avg;
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"�� Ű�� ?");
			height[i]=sc.nextInt();	
			tot += height[i];
		}
		avg = (double)tot/name.length;
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"�� Ű:"+height[i]);
		}
		System.out.printf("Ű�� ����� ?%.1f",avg);
		
		
		
	}
}

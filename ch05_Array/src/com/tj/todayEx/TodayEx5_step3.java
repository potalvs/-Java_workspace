package com.tj.todayEx;

import java.util.Scanner;


//3�ܰ� : �迭�� �̿��Ͽ� �л���(���� ,ö��, �浿 ,����, ����) �� Ű�� �Է¹޾� ���������� �����մϴ� . 
public class TodayEx5_step3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] name = {"����","ö��","�浿","����","����"};
		int[] height = new int[name.length];
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]+"�� Ű�� ?");
			height[i]=sc.nextInt();	
		}
	//�����ϱ�
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
		System.out.println("�� �� �� ");
		for(int i=0; i<name.length;i++) {
			System.out.println(height[i]+"("+name[i]+")  ");
		}
	}
}

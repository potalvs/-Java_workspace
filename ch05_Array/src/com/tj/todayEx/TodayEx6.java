package com.tj.todayEx;
//2680 �� �Ž��� ���� 500�� ¥�� x��,....10��¥�� x�� 
public class TodayEx6 {
	public static void main(String[] args) {
		int money = 2680;
		int[] coinUnit = {500,100,50,10};
		System.out.print(money+"�� �Ž��� ����\n");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��¥�� "+ money/coinUnit[i]+"�� "+money+"��");
			money =money%coinUnit[i];
			
		}
		// i=0 money =2680 coin =500 �� ¥��
		// i=1 money =180 coin = 100��¥��
		// i=2 money =80 coin =50��¥��
		// i=3 money =30 coin =30 �� ¥�� 
	}
}

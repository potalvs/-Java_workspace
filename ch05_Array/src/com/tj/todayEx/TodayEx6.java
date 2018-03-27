package com.tj.todayEx;
//2680 원 거스름 돈은 500원 짜리 x개,....10원짜리 x개 
public class TodayEx6 {
	public static void main(String[] args) {
		int money = 2680;
		int[] coinUnit = {500,100,50,10};
		System.out.print(money+"원 거스름 돈은\n");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원짜리 "+ money/coinUnit[i]+"개 "+money+"원");
			money =money%coinUnit[i];
			
		}
		// i=0 money =2680 coin =500 원 짜리
		// i=1 money =180 coin = 100원짜리
		// i=2 money =80 coin =50원짜리
		// i=3 money =30 coin =30 원 짜리 
	}
}

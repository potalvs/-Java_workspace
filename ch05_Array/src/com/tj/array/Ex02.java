package com.tj.array;

public class Ex02 {
	public static void main(String[] args) {
		int i;
		i = 10;
		// 2. 배열을 선언(배열공간 확보)하고 초기화는 따로한다.
		int[] iArr = new int[3]; //배열의 길이 :3
		iArr[0]=100;
		iArr[1]=200;
		iArr[2]=3000;
		
		for(int idx = 0; idx<iArr.length;idx++) {
			System.out.printf("iArr[%d]=%d\n",idx,iArr[idx]);
		}
		
		
		
		
		
	}
}

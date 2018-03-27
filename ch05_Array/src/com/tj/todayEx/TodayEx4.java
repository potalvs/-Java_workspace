package com.tj.todayEx;
//76,45,34,89,100,50,90,92 정렬하기 
public class TodayEx4 {
	public static void main(String[] args) {
		int[] arr = {76,45,34,89,100,50,90,92};
		int[] sortArr = new int[arr.length];
		
		
		System.arraycopy(arr, 0, sortArr, 0, arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(sortArr[i] >sortArr[j]) {
					int temp = sortArr[i];
					sortArr[i]=sortArr[j];
					sortArr[j]=temp;
				}
			}
		}
		for(int a :arr) {
			System.out.print(a+"\t");
		}
			System.out.println("\n정렬후");
			for(int a1 :sortArr) {
				System.out.print(a1 +"\t");
			}
		}
	}


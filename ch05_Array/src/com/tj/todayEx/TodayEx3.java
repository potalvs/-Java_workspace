package com.tj.todayEx;
//76,45,34,89,100,90,92 �迭�� �հ�,��� max,min;
public class TodayEx3 {
	public static void main(String[] args) {
		
		int[] arr = {76,45,34,89,100,50,90,92};
		int sum =0 , avg , max=0 , min=999;
		for(int i = 0 ; i<arr.length; i++) {
			sum +=arr[i]; // �հ�ó��
			if(arr[i]>max) {
				max = arr[i];//�ִ밪
			}
			if(arr[i]<min) {
				min = arr[i]; //�ּҰ�
			}
		}
		avg =sum/arr.length;
		System.out.println("�հ�:"+sum+"���="+avg+"�ִ밪="+max+"�ּҰ�="+min);
		
		
		
		//�հ�
		
		/*for(int a : arr) 
			sum+=a;
		// max 
		for(int a :arr)
			if(max<a)
				max=a;
		//min
		for(int i=0 ; i<arr.length;i++)
			if(min>arr[i])
				min = arr[i];
		*/
	
		
	}
}

package com.tj.todayEx;
//76,45,34,89,100,90,92 배열의 합계,평균 max,min;
public class TodayEx3 {
	public static void main(String[] args) {
		
		int[] arr = {76,45,34,89,100,50,90,92};
		int sum =0 , avg , max=0 , min=999;
		for(int i = 0 ; i<arr.length; i++) {
			sum +=arr[i]; // 합계처리
			if(arr[i]>max) {
				max = arr[i];//최대값
			}
			if(arr[i]<min) {
				min = arr[i]; //최소값
			}
		}
		avg =sum/arr.length;
		System.out.println("합계:"+sum+"평균="+avg+"최대값="+max+"최소값="+min);
		
		
		
		//합계
		
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

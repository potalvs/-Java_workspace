package com.tj.op;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("==========논리 연산자(|| &&)===================");
		
		int i,j,h;
		i=1;
		j=10;
		h=100;
		
		System.out.println("i="+i +" j="+j+ " h="+h);
		System.out.println("&& : (i>j) && (j>h) :" +((i<j) && (++j>h)));// 
		
		System.out.println("i="+i +" j="+j+ " h="+h);
		System.out.println("&& : (i>j) || (j>h) :" +((i<j)||(++j>h))); //앞(i<j)이 트루 이면 뒤(++j>h)에껀 보지않음 그래서 j값은 11 로 뿌려짐 .
		System.out.println(j);
		
		
		
	}
}

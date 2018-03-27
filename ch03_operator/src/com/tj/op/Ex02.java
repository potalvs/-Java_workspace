package com.tj.op;


public class Ex02 {

	public static void main(String[] args) {
		System.out.println("========증감연산자( ++, --)=============");
		
		int n1 =10;
		int n2 =++n1;
		System.out.println("n1="+n1+"\t n2="+n2);
		
		int n3 =10;
		System.out.println("n3="+n3++);
		System.out.println("n3="+ ++n3);
		
		
		int temp =10;
		
		System.out.printf("%d %d %d %d",temp++,++temp,temp--,--temp );
		
		
	

	}

}

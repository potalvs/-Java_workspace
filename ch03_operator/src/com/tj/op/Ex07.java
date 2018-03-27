package com.tj.op;

public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("=============할당 연산자=============");
		int n1=10*3;
		
		n1 +=10;// n1=n1+10;
		n1 -=10;// n1=n1-10;
		n1 *=10;// n1= n1*10;
		n1 /=10;// n1= n1/10;
		n1 += 1;// n1= n1+1;
	
		System.out.println(n1);
		
		int n2 = 1;
		System.out.println(n2);
		System.out.println("n2= "+(n2=100));
		int n3 ,n4, n5;
		
		n3 = n4 = n5 = 100;
		System.out.println(" n3=" +n3+" n4="+n4+" n5="+ n5);
		
		
	}
}

package com.tj.var;

public class Ex05 {
	public static void main(String[] args) {
		int i1 =10;
		long l1 =220000000000000L;
		
		//형 변환 = 묵시적인 형변환 + 명시적인 형변환 
		
		l1=i1; // 묵시적인 형 변환 (작은 주머니의 데이터를 큰 주머니로 넣을떄) 
		
		System.out.println(l1);
		
		double d1 = 13.91;
		i1=(int)d1;   //큰 주머니의 데이터를 작은 주머니로 넣는다 . 명시적인 형 변환
		
		System.out.println(i1);  //System.out.println 이라는 꾸러미를 전문적인 용어로 Api,오픈 라이브러리 라고 부른다.
	}

}

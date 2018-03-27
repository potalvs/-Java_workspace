package com.tj.op;

public class EX01 {
	
	public static void main(String[] args) {
		
		System.out.println("===========산술연산자==========");
		
		int n1 =33, n2 =10;
		int result;
		double resultDouble;
		
		result = n1+n2;
		System.out.printf("%d %c %d= %d\n",n1,'+',n2,result);
		result = n1-n2;
		System.out.printf("%d %c %d =%d\n",n1,'-',n2,result);
		result = n1*n2;
		System.out.printf("%d %c %d =%d\n",n1,'*',n2,result);
		result = n1/n2;
		System.out.printf("%d %c %d = %d\n",n1,'/',n2,result);
		
		resultDouble =n1 / (double)n2;
		System.out.printf("%d %c %d = %2.1f\n",n1,'/',n2,resultDouble);
		
		result =n1%n2;
		System.out.printf("%d %c %d =%f\n",n1,'%',n2,resultDouble);
		System.out.printf("%d %c %d =%d\n",n1,'%',n2,result);
		
		resultDouble =n1 /(double)0.0;   //0.0 은 컴퓨터 상에서는 0.0000000000000000000000000000000000000000001이런수로 작은수로 표현한다고 생각.
		//0.0에 가까운숫자로 인식 
		System.out.println("%d %c %f=%f"+n1+'/'+0.0+resultDouble); // 무한대로 인식합니당 .~!!
		resultDouble= n1%0.0;
		System.out.println("%d %c %f=%f"+n1+'%'+0.0+resultDouble);
		
		if((n1%2)==0) { // 연산자에도 우선 순위가 있다. 이 소스에서는 %가 먼저 연산되지만 한번 생각할수있지만 괄호를 쳐주면 괄호부터 계산하므로 가독성이 높다. 
			System.out.println("n1은 짝수입니다");
			
		}else {
			System.out.println("n1은 홀수입니다.");
		}
		if((n1%5)==0) {
			System.out.println("n1은 5의 배수입니다.");
		}else
			System.out.println("n1은 5의 배수가 아닙니다.");
		
		
		
		
		
		
		
		
		
		
	}
}

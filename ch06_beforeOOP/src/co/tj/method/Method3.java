package co.tj.method;

import java.util.Scanner;

//재귀적 호출 : Amethod 가 Amethod를 호출 하는 예 : 5! = 5*4*3*2*1 
public class Method3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		do {
			System.out.println("몇 factorial 을 계산할래 ? ");
			su =sc.nextInt();
		}while(su<=0);
		Method3 method = new Method3();
		System.out.println(su +"!="+method.factorial(su));
	}
	private long factorial(int f) {
		//foctorial(1) =1;
		//factorial(2) = 2 * factorial(1)
		//factorial(3) =3*factorial(2);
		//factorial(n) = n*factorial(n-1); (단, n>=2)
		if(f==1) {
			return 1;  //1이들어갈경우 팩토리얼 공식과 안맞는다 그래서 1일때 팩토리얼 값이 1인 값을 반환해준다 . 
		}else {
			return f*factorial(f-1);
		}
	}
	
	
	
	
/*	private long factorial(int su) {
		int result=1;
		for(int i =su;i>=1;i--) {
			result = result*i;
		}
	
		return result;
	}*/
	
	
	
}

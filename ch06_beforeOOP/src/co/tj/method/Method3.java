package co.tj.method;

import java.util.Scanner;

//����� ȣ�� : Amethod �� Amethod�� ȣ�� �ϴ� �� : 5! = 5*4*3*2*1 
public class Method3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		do {
			System.out.println("�� factorial �� ����ҷ� ? ");
			su =sc.nextInt();
		}while(su<=0);
		Method3 method = new Method3();
		System.out.println(su +"!="+method.factorial(su));
	}
	private long factorial(int f) {
		//foctorial(1) =1;
		//factorial(2) = 2 * factorial(1)
		//factorial(3) =3*factorial(2);
		//factorial(n) = n*factorial(n-1); (��, n>=2)
		if(f==1) {
			return 1;  //1�̵���� ���丮�� ���İ� �ȸ´´� �׷��� 1�϶� ���丮�� ���� 1�� ���� ��ȯ���ش� . 
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

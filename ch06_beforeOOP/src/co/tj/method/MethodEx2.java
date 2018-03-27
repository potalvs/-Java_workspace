package co.tj.method;

import java.util.Scanner;

//사용자로 부터 1~9 의 값을 출력하여 구구단을 완성하시오 (단  메소드를 사용 한다. )
public class MethodEx2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int gugu;
		do {
			System.out.println("1~9사이의  원하는 구구단은   ?");
			gugu =sc.nextInt();	                                                    
		}while(gugu<1 || gugu>9);
		MethodEx2 m2 = new MethodEx2();
		m2.gugudan_out(gugu);
	}
	private void gugudan_out(int gugu){ //gugu 의 구구단을 출력
		System.out.println(gugu+"단 구구단 입니다.");
		for(int i=1 ; i<=9; i++) {
			System.out.println(gugu + "*"+i+"="+(gugu*i));
		}
	}
	
	
}

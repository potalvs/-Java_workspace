package co.tj.method;

import java.util.Scanner;

//����ڷ� ���� 1~9 �� ���� ����Ͽ� �������� �ϼ��Ͻÿ� (��  �޼ҵ带 ��� �Ѵ�. )
public class MethodEx2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int gugu;
		do {
			System.out.println("1~9������  ���ϴ� ��������   ?");
			gugu =sc.nextInt();	                                                    
		}while(gugu<1 || gugu>9);
		MethodEx2 m2 = new MethodEx2();
		m2.gugudan_out(gugu);
	}
	private void gugudan_out(int gugu){ //gugu �� �������� ���
		System.out.println(gugu+"�� ������ �Դϴ�.");
		for(int i=1 ; i<=9; i++) {
			System.out.println(gugu + "*"+i+"="+(gugu*i));
		}
	}
	
	
}

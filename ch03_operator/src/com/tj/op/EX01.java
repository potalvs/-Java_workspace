package com.tj.op;

public class EX01 {
	
	public static void main(String[] args) {
		
		System.out.println("===========���������==========");
		
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
		
		resultDouble =n1 /(double)0.0;   //0.0 �� ��ǻ�� �󿡼��� 0.0000000000000000000000000000000000000000001�̷����� �������� ǥ���Ѵٰ� ����.
		//0.0�� �������ڷ� �ν� 
		System.out.println("%d %c %f=%f"+n1+'/'+0.0+resultDouble); // ���Ѵ�� �ν��մϴ� .~!!
		resultDouble= n1%0.0;
		System.out.println("%d %c %f=%f"+n1+'%'+0.0+resultDouble);
		
		if((n1%2)==0) { // �����ڿ��� �켱 ������ �ִ�. �� �ҽ������� %�� ���� ��������� �ѹ� �����Ҽ������� ��ȣ�� ���ָ� ��ȣ���� ����ϹǷ� �������� ����. 
			System.out.println("n1�� ¦���Դϴ�");
			
		}else {
			System.out.println("n1�� Ȧ���Դϴ�.");
		}
		if((n1%5)==0) {
			System.out.println("n1�� 5�� ����Դϴ�.");
		}else
			System.out.println("n1�� 5�� ����� �ƴմϴ�.");
		
		
		
		
		
		
		
		
		
		
	}
}

package co.tj.method;

public class Ex03 {
	public static void main(String[] args) {
		//Sansu Ŭ������ �̿��Ͽ� san ��ü(����) �� ���� 
		Sansu san = new Sansu();
		int sum = san.sum(1,10);
		System.out.println("��������? "+sum);
		System.out.println(san.evenOdd(sum));
		System.out.println("-5�� ���밪��"+san.abs(-5));
	
		
	}
}

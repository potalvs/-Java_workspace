package co.tj.method;
// �޼ҵ带 �������� �������� ���� ���������ϱ� ���ϴ� . 
public class Ex02 {
	public static void main(String[] args) {
		Ex02 ex =new Ex02(); // static ������� ��ü�� ����� �����ؾ��Ѵ� . 
		int sum =ex.sum(1,10); //�Ұ�ȣ�� ������ ������ �޼ҵ�
		                    //�޼ҵ��̸�(�Ű����� 1 , �Ű����� 2,....)		System.out.println("��������" +sum);
		System.out.println(ex.evenOdd(sum));
        sum = ex.sum(5,48);
		System.out.println(sum);
		System.out.println(ex.evenOdd(sum));

	}



	private String evenOdd(int value) { // static�� ������ ��ü�� Ex02��� Ŭ������ ��ü�� ����� ��� ����� �����ϴ� . 
		/*String result = (sum%2==0)? "¦���Դϴ�":"Ȧ���Դϴ�";*/
		String result;
		if(value%2==0) {
			result = "¦���Դϴ�";
		}else {
			result ="Ȧ���Դϴ�";
		}
		return result;
	}





	private int sum(int from, int to) {
		int result = 0;
		for(int i =from; i<=to; i++) {//form���� to���� result �� ���� 
			result +=i;
		}
	
		
		return result;
	}
}

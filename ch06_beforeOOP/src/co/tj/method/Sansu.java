package co.tj.method;
// ����� ���õ� �޼ҵ常 ��� Ŭ������ ���鲨�� . 
public class Sansu {
	public int sum(int from , int to) {
		int result = 0;
		for(int i =from; i<to;i++) {
			result +=i;
		}
		return result;
	}
	public String evenOdd(int value) {
		String result = null;
		System.out.println(value%2==0?"¦���Դϴ�":"Ȧ���Դϴ�.");
		/*if(value%2==0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}*/
		return result;
	}
	public int abs(int value) {
		/*int result =value>=0? value:-value;*/
		int result;
		if(value>=0) {
			result = value;
		}else {
			result = -value;
		}
		return result;
	}

}

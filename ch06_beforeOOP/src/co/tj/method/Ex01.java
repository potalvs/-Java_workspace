package co.tj.method;
// 1~10���� �� ���� ����ϰ� Ȧ������ �ƴ��� ��� - �޼ҵ� �� ����������� �ҽ��ڵ�
public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =0; i<11;i++ ) {
			sum +=i;
		}
		System.out.println("1���� 10������ ������:"+sum);
		/*System.out.println(sum%2==0? "¦���Դϴ�":"Ȧ���Դϴ�");*/
		if(sum%2==0) {
			System.out.println("¦���Դϴ�"+sum);
		}else {
			System.out.println("Ȧ���Դϴ�."+sum);
		}
		 sum = 0;
			
			for(int i =5; i<=50;i++ ) {
				sum +=i;
			}
			System.out.println("1���� 10������ ������:"+sum);
			if(sum%2==0) {
				System.out.println("¦���Դϴ�"+sum);
			}else {
				System.out.println("Ȧ���Դϴ�."+sum);
			}
	}
}

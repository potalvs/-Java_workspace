package co.tj.method;

public class Method1 {
	public static void main(String[] args) {
		
		printCh('=');
		System.out.println("HelloWorld,Java");
		printCh('-',50);
		System.out.println("HelloWorld,Java");
		printCh();
		System.out.println("HelloWorld,Java");
		printCh('=');
		System.out.println("helloworld");
		printCh(30);
	}
	 /*  private static int printCh(char ch , int size) {
		   
	   }*/
	   //�޼ҵ��� �������� �Ű� ������ ���� (return type ���δ� ���кҰ�
	   private static void printCh(char ch, int size) {//�Ű����� 2���ִ� printCh �޼ҵ��� ������. method�� overloading
		   for(int i=0; i<size;i++) {
			   System.out.print(ch);
		   }
		   System.out.println();
	   }

	   private static void printCh(){//�Ű� �������� printCh
		   System.out.println("------------------------------");
	   }
	   private static void printCh(char ch) {//�Ű����� 1���ִ� printCh
		   for(int i=0; i<30; i++) {
			   System.out.print(ch);
		   }
		   System.out.println();
	   }
	   private static void printCh(int size) {
		   for(int i =0; i>size;i++) {
			   System.out.print('��');
		   }
		   System.out.println();
	   }
}

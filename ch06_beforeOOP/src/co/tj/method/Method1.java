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
	   //메소드의 다형성은 매개 변수로 구분 (return type 으로는 구분불가
	   private static void printCh(char ch, int size) {//매개변수 2개있는 printCh 메소드의 다형성. method의 overloading
		   for(int i=0; i<size;i++) {
			   System.out.print(ch);
		   }
		   System.out.println();
	   }

	   private static void printCh(){//매개 변수없는 printCh
		   System.out.println("------------------------------");
	   }
	   private static void printCh(char ch) {//매개변수 1개있는 printCh
		   for(int i=0; i<30; i++) {
			   System.out.print(ch);
		   }
		   System.out.println();
	   }
	   private static void printCh(int size) {
		   for(int i =0; i>size;i++) {
			   System.out.print('■');
		   }
		   System.out.println();
	   }
}

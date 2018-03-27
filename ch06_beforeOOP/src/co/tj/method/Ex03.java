package co.tj.method;

public class Ex03 {
	public static void main(String[] args) {
		//Sansu 클래스를 이용하여 san 객체(변수) 를 생성 
		Sansu san = new Sansu();
		int sum = san.sum(1,10);
		System.out.println("누적합은? "+sum);
		System.out.println(san.evenOdd(sum));
		System.out.println("-5의 절대값은"+san.abs(-5));
	
		
	}
}

package co.tj.method;
// 메소드를 쓰는이유 가독성이 높고 유지보수하기 편리하다 . 
public class Ex02 {
	public static void main(String[] args) {
		Ex02 ex =new Ex02(); // static 없을경우 객체를 만들고 실행해야한다 . 
		int sum =ex.sum(1,10); //소괄호가 있으면 무조껀 메소드
		                    //메소드이름(매개별수 1 , 매개변수 2,....)		System.out.println("누적합은" +sum);
		System.out.println(ex.evenOdd(sum));
        sum = ex.sum(5,48);
		System.out.println(sum);
		System.out.println(ex.evenOdd(sum));

	}



	private String evenOdd(int value) { // static이 없으면 객체를 Ex02라는 클래스에 객체를 만들어 줘야 사용이 가능하다 . 
		/*String result = (sum%2==0)? "짝수입니다":"홀수입니다";*/
		String result;
		if(value%2==0) {
			result = "짝수입니다";
		}else {
			result ="홀수입니다";
		}
		return result;
	}





	private int sum(int from, int to) {
		int result = 0;
		for(int i =from; i<=to; i++) {//form부터 to까지 result 에 누적 
			result +=i;
		}
	
		
		return result;
	}
}

package co.tj.method;
// 1~10까지 의 합을 출력하고 홀수인지 아닌지 출력 - 메소드 를 사용하진않은 소스코드
public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =0; i<11;i++ ) {
			sum +=i;
		}
		System.out.println("1부터 10까지의 누적합:"+sum);
		/*System.out.println(sum%2==0? "짝수입니다":"홀수입니다");*/
		if(sum%2==0) {
			System.out.println("짝수입니다"+sum);
		}else {
			System.out.println("홀수입니다."+sum);
		}
		 sum = 0;
			
			for(int i =5; i<=50;i++ ) {
				sum +=i;
			}
			System.out.println("1부터 10까지의 누적합:"+sum);
			if(sum%2==0) {
				System.out.println("짝수입니다"+sum);
			}else {
				System.out.println("홀수입니다."+sum);
			}
	}
}

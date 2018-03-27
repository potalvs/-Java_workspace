package co.tj.method;
// 산수와 관련된 메소드만 묶어서 클래스로 만들꺼임 . 
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
		System.out.println(value%2==0?"짝수입니다":"홀수입니다.");
		/*if(value%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다.");
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

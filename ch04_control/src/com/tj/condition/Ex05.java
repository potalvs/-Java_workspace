package com.tj.condition;

import java.util.Scanner;

/*국영수를 입력받아 평균을 하고   
 * 각과목이  몇점 평균보다 높은지 낮은지 출력
 * 
 * */
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int kor;
		int mat;
		int eng;
		double avg;
	
		System.out.println("국어점수를 입력하세요");
		kor =sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		mat =sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng =sc.nextInt();
		
		avg = (kor+mat+eng)/3;
		
		System.out.printf("평균은 %.2f\n",avg);
		
	
		
		if(avg<kor) {
			System.out.println("국어점수가 평균보다"+(kor-avg)+ "점 높습니다.");
		}else if(avg>kor){
			System.out.println("국어점수가 평균보다"+(avg-kor)+ "점 낮습니다.");
		}else {
			System.out.println("국어점수와 평균은 같습니다.");
		}
		

		if(avg<mat) {
			System.out.println("수학점수가"+ "점수가 평균보다"+(mat-avg)+ "점 높습니다.");
		}else if(avg>mat){
			System.out.println("수학점수가 평균보다"+(avg-mat)+ "점 낮습니다.");
		}else {
			System.out.println("수학점수와 평균은 같습니다.");
		}
		

		if(avg<eng) {
			System.out.println("영어점수가 평균보다"+(eng-avg)+ "점 높습니다.");
		}else if(avg>eng){
			System.out.println("영어점수가 평균보다"+(avg-eng)+ "점 낮습니다.");
		}else {
			System.out.println("영어점수와 평균은 같습니다.");
		}
		
	}

}

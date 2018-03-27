package com.tj.car;
//메인 함수에서 써먹을 클래스 속성을 만든다 .
public class Car {
	private String color;// 데이터(속성)
	private int cc;
	private int speed;
	public void drive() {
		speed = 60;
		System.out.println("운전한다 속도는 "+speed+"km/h로 운전한다 .");
	}
	public void park() {
		speed = 0;
		System.out.println("주차한다 속도는 " +speed+"km/h");
	}
	public void race() {
		speed =120;
	System.out.println("레이싱한다 속도는" +speed +"km/h");
	}
	//getter 메소드(private 인 데이터를 return 해주는 메소드)
	public String getColor() {
		return color;
	}
	public int getCc() {
		return cc;
	}
	
	//setter메소드 (private 인 데이터를 setting 해주는 메소드) 외부에서 접근제한 된 데이터를 사용 할 수 있게 해줌 . 
	public void setColor(String color) {
		this.color =color; //this 는 나의 객체 의 데이터 
	}
	public void setCc(int cc) {
		this.cc=cc;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
}

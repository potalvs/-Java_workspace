package com.tj.car;
//���� �Լ����� ����� Ŭ���� �Ӽ��� ����� .
public class Car {
	private String color;// ������(�Ӽ�)
	private int cc;
	private int speed;
	public void drive() {
		speed = 60;
		System.out.println("�����Ѵ� �ӵ��� "+speed+"km/h�� �����Ѵ� .");
	}
	public void park() {
		speed = 0;
		System.out.println("�����Ѵ� �ӵ��� " +speed+"km/h");
	}
	public void race() {
		speed =120;
	System.out.println("���̽��Ѵ� �ӵ���" +speed +"km/h");
	}
	//getter �޼ҵ�(private �� �����͸� return ���ִ� �޼ҵ�)
	public String getColor() {
		return color;
	}
	public int getCc() {
		return cc;
	}
	
	//setter�޼ҵ� (private �� �����͸� setting ���ִ� �޼ҵ�) �ܺο��� �������� �� �����͸� ��� �� �� �ְ� ���� . 
	public void setColor(String color) {
		this.color =color; //this �� ���� ��ü �� ������ 
	}
	public void setCc(int cc) {
		this.cc=cc;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
}

package com.tj.car;

public class CarMain {

	public static void main(String[] args) {
		Car myPorsche =new Car(); //��ü�� ����� .
	
		Car yourPorsche =new Car();
		myPorsche.setColor("red");
		//myPorsche.color = "red";
		myPorsche.setCc(3000);
		myPorsche.drive();
		myPorsche.race();
		myPorsche.park();
		System.out.println("myporsche ���� �� ��ⷮ:"+myPorsche.getColor()+"/"+myPorsche.getCc());
		yourPorsche.setColor("gray");
		yourPorsche.setCc(2500);
		yourPorsche.drive();
		yourPorsche.race();
		yourPorsche.park();
		System.out.println("myporsche ���� �� ��ⷮ:"+yourPorsche.getColor()+"/"+yourPorsche.getCc());
	}

}

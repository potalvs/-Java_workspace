package com.tj.car;

public class CarMain {

	public static void main(String[] args) {
		Car myPorsche =new Car(); //객체를 만든다 .
	
		Car yourPorsche =new Car();
		myPorsche.setColor("red");
		//myPorsche.color = "red";
		myPorsche.setCc(3000);
		myPorsche.drive();
		myPorsche.race();
		myPorsche.park();
		System.out.println("myporsche 색상 및 배기량:"+myPorsche.getColor()+"/"+myPorsche.getCc());
		yourPorsche.setColor("gray");
		yourPorsche.setCc(2500);
		yourPorsche.drive();
		yourPorsche.race();
		yourPorsche.park();
		System.out.println("myporsche 색상 및 배기량:"+yourPorsche.getColor()+"/"+yourPorsche.getCc());
	}

}

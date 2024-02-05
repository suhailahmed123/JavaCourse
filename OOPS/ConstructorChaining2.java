package com.corejava;

class Exam1 {
	int x, y;

	Exam1() {
		super();
		x = 25;
		y = 35;
	}

	Exam1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Exam2 extends Exam1 {
	int a, b;

	Exam2() {
		//super();
		a = 20;
		b = 30;
	}

	Exam2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class ConstructorChaining2 {

	public static void main(String[] args) {
		
		Exam2 e2 = new Exam2();
		e2.disp();
	}

}

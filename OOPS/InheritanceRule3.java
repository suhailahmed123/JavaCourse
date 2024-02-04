// Rule3 - Multiple inheritance is not allowed in java

class Demo6 {
	int a = 10;

	void displayValue1() {
		System.out.println("inside Demo1 class" + a);
	}
}

class Demo7 extends Demo6 {
	int b = 20;

	void displayValue2() {
		System.out.println("inside Demo2 class" + b);
	}
}

class Demo8 extends Demo6,Demo7{	// throws error
	int c = 20;

	void displayValue3() {
		System.out.println("inside Demo2 class" + c);
	}
}

public class InheritanceRule3 {

	public static void main(String[] args) {

		Demo8 d8 = new Demo8();
		d8.displayValue1();
		//d8.displayValue2();	// throws error saying The method displayValue2() is undefined for the type Demo8
		d8.displayValue3();
	}

}

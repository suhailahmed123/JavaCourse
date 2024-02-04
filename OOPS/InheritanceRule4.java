//Rule4 - cyclic inheritance is not allowed/supported in java

class Demo9 extends Demo10 {
	int a = 100;

	void displayValue1() {
		System.out.println(a);
	}

}

class Demo10 extends Demo9 {
	int b = 200;

	void displayValue2() {
		System.out.println(b);
	}
}

public class InheritanceRule4 {

	public static void main(String[] args) {
		Demo10 d10 = new Demo10();
		d10.displayValue1(); // The method displayValue1() is undefined for the type Demo10
		d10.displayValue2();
	}

}

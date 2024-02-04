//Rule2 - java supports multi-level inheritance

class Demo3 {
	int b = 10;
}

class Demo4 extends Demo3 {
	int a = 20;

	void display1() {
		System.out.println(b);
	}
}

class Demo5 extends Demo4 {
	void display2() {
		System.out.println(a);
	}
}

public class InheritanceRule2 {

	public static void main(String[] args) {
		Demo5 d5 = new Demo5();
		d5.display1();
		d5.display2();
	}

}

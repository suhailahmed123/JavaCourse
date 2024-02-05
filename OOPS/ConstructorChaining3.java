class Trail1 {
	int x, y;

	Trail1() {
		x = 10;
		y = 20;
	}

	Trail1(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Trail2 extends Trail1 {
	int a, b;

	Trail2() {
		a = 100;
		b = 200;
	}

	public Trail2(int a, int b) {
		super();
		this.a = a;
		this.b = b;

	}

	void display() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class ConstructorChaining3 {

	public static void main(String[] args) {
		Trail2 t2 = new Trail2(50, 60);
		t2.display();

	}

}

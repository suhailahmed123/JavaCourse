class Game1 {
	int x, y;

	Game1() {
		x = 30;
		y = 40;
	}

	Game1(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Game2 extends Game1 {
	int a, b;

	Game2() {
		super();
	}

	Game2(int a, int b) {
		super(a, b);
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

public class ConstructorChaining4 {

	public static void main(String[] args) {

		Game2 g2 = new Game2(11, 12);
		g2.display();
	}

}

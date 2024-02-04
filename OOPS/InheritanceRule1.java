//Rule1 - In java private members of a class do not participate in inheritance

class Demo1 {
  //private int a = 10;
	int a = 10;
	int b = 12;
}

class Demo2 extends Demo1 {
	void display() {
		System.out.println(a);  // throws error [The field Demo1.a is not visible] if we initialize a as private
		System.out.println(b);
	}

	void changeValue() {
		a = 45;
		b = 77;
	}
}

public class InheritanceRule1 {

	public static void main(String[] args) {

		Demo2 d2 = new Demo2();
		d2.display();
		d2.changeValue();
		d2.display();

	}

}


/*
Java supports inheritance but not at the cost of affecting encapsulation.
default, protected and public keyword are used in inheritance but not private.
*/


/*
😊😊😊😊 HAPPY LEARNING 😊😊😊😊
*/


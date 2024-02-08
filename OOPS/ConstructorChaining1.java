/*

Constructor Chaining - It the process of taking the control from child class constructor to parent class constructor.

*/
class One {
	
	public One() {
		//super(); 	//super() is present automatically no need to tell explicitly and it class Object class constructor
		System.out.println("inside One class");
	}
}

class Two extends One {

	public Two() {
		System.out.println("inside Two class");
	}

	// if we make constructor as a method also there a non parameter constructor present
	// already which is not visible and it automatically calls to it's parent class constructor

	public void displayTwo() {
		// super(); // there will be a super() method which calls it's parent class constructor
		System.out.println("inside Two method");
	}
}

public class ConstructorChaining1 {

	public static void main(String[] args) {
		Two t = new Two();
		t.displayTwo();
	}

}

/*

OUTPUT
inside One class
inside Two class

*/


/*
😊😊 HAPPY LEARNING 😊😊
*/

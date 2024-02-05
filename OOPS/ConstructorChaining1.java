/*

- Constructor Chaining - 

*/
class One {
	
	public One() {
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

                                                            /******CONSTRUCTOR CHAINING***********/

/*

Local Chaining - One constructor calling another constructor inside a same class is called loacal chaining or constructor chaining.
we use this() method to achieve local chaining

- IMP
this() is a function call which is used to take control from one contructor to another contructor within the same class. 

*/
class Dog {
	private String name;
	private String breed;

	public Dog() {
		name = "Snoopy";
		breed = "Beagle";
	}

	public Dog(String name, String breed) {
		this();
	}

	public String getName() {
		return name;
	}
 
	public String getBreed() {
		return breed;
	}
}

public class LocalChaining1 {

	public static void main(String[] args) {

		Dog d = new Dog("Remo","BullDog");
		System.out.println(d.getName());
		System.out.println(d.getBreed());

	}

}


/*  CODE EXPLAININATION

- The control starts from main() and enters into the main() and the first line of main() method is object creation using "new" keyword.

- And in the heap segment it assigns default values to it[ for int=0, float=0.0, string=null].

- After assigining the values there is a call to a parameterized constructor then the contril goes to parameterized constructor.

- Here it encounters a this() method which is call to another constructor of same class so the control go to zero-parameterized constructor and there it assigns
  the values name, breed [in the memory the default values get replaced by snoopy and beagle].

- Next the control comes back to the same point [parameterized constructor] and there are no lines to executes and it gets back to main() method
  and next there is display or print() then by using getName() and getBrerd() it displays the output and the execution completes.



OUTPUT:-
Snoopy
Beagle
*/


/*
😊😊😊😊 HAPPY LEARNING 😊😊😊😊
*/


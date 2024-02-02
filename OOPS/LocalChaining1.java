                                                            /******CHAINING***********/

/*

There are ttwo types of chaining in java
1. Local Chaining
2. Constructor Chaining

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

- The control starts from main() and enters into the main() and the first line of main() method is object creation using "new" keyword [new Dog()].

- so now the Dog() is a class or call to that class and when the control goes to that class it encounters instance variables name and breed of type String.

- And in the heap segment it assigns default values to it[ for int=0, float=0.0, string=null].

- After assigining the values there is a call to a parameterized constructor then the control goes to parameterized constructor.

- Here it encounters a this() method which is call to another constructor of same class so the control go to zero-parameterized constructor and there it replaces
  the default values with name, breed [snoopy and beagle].

- Next the control comes back to the same point [parameterized constructor] and there are no lines to executes and it gets back to main() method
- left side [Dog d] there is a reference 'd' and in stack memory the address of heap memory segment is stored and it starts points to heap.

- and next there is display or print() then by using c.getName() and c.getBreed() it displays the output and the execution completes.



OUTPUT:-
Snoopy
Beagle
*/


/*
😊😊😊😊 HAPPY LEARNING 😊😊😊😊
*/


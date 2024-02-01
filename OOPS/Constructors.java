/*********************************************CONSTRUCTORS****************************/
/*

- James Gosling told that he has given separate setters
1. It doesn't have return type
2. setters will have same name as class name and this is called as constructor

So we can write the definition of a constructor as, 
- The constructor is such a method who doesn't have any return type and has same name as of class name.

how to create a constructor?
- The constructor can be created in the same way as object is created
- Ex:- Client c = new Client();
	Human h = new Human();
 	Car c = new Car();

here let's understand deeper about the constructor syntax
---> Client - is a class name
---> c - is a reference or in other words we can say as handle or a steering which is used to control or access
---> new - is a keyword used create objects/built-in keyword
---> Client() - is also a class name but () is a call to zero parameterized constructor

Advantage:-
1. constructors will have same name as class name
2. constructor will not have any return type
3. constructor will get called during/when object is created

There are two types of constructors
1. Zero parameterized constructor or non-parameterized constructor
2. Parameterized constructor

- IMP
* if there is a parameterized constructor present then we have to explicitly write/create non-parameterized constructor

* if there is no zero parameter constructor then there is no use of creating object of that call as it can throws error by saying [The constructor Client() is undefined]
		Client c1 = new Client(); // Throws error [The constructor Client() is undefined] or constructor not found
*/
class Client {
	private int id;
	private String name;
	private long number;

	public Client() { // non-parameter constructor or zero parameterized constructor

		//This constructor not visible but automatically called when we are calling to non - parameter constructor or at the time of object creation
		id = 1;
		name = "suhail";
		number = 7418529630L;
	}

	public Client(int id, String name, long number) { // parameterized constructor
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getNumber() {
		return number;
	}
}

public class Constructors {

	public static void main(String[] args) {

		Client c1 = new Client(); // Throws error [The constructor Client() is undefined]
		// Client() ---> default constructor gets called automatically
		System.out.println(c1.getId() + " " + c1.getName() + " " + c1.getNumber());

		// if there is parameterized constructor we need to create non-parameterized constructor explicitly

		Client c2 = new Client(007, "James Bond", 7418529630L);
		System.out.println(c2.getId() + " " + c2.getName() + " " + c2.getNumber());

	}
}



/***
	HAPPY LEARNING
	***/

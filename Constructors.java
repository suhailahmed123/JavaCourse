package com.corejava;

class Client {
	private int id;
	private String name;
	private long number;

	public Client() { // non-parameter constructor

		// it is not visible but automatically called
	}

	public Client(int id, String name, long number) { // parameterized constructor
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(long number) {
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

		Client c1 = new Client(); // Throws error [The constructor Customer() is undefined]
		// Client() ---> default constructor gets called automatically
		c1.setId(22);
		c1.setName("Suhail");
		c1.setNumber(7026763291L);

		System.out.println(c1.getId() + " " + c1.getName() + " " + c1.getNumber());

		Client c2 = new Client(); // Throws error [The constructor Customer() is undefined]
		c2.setId(00);
		c2.setName("Ahmed");
		c2.setNumber(7412588520L);
		System.out.println(c2.getId() + " " + c2.getName() + " " + c2.getNumber());

		// if there is parameterized constructor we need to create non-parameter
		// constructor explicitly

		Client c3 = new Client(007, "James Bond", 7418529630L);
		System.out.println(c3.getId() + " " + c3.getName() + " " + c3.getNumber());

	}
}

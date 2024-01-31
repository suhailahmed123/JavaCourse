package com.corejava;

class Customer {
	private int id;
	private String name;
	private long number;

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

public class Encapsulation {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setId(22);
		c1.setName("Suhail");
		c1.setNumber(7026763291L);

		System.out.println(c1.getId() + " " + c1.getName() + " " + c1.getNumber());

		Customer c2 = new Customer();
		c2.setId(00);
		c2.setName("Ahmed");
		c2.setNumber(7412588520L);
		System.out.println(c2.getId() + " " + c2.getName() + " " + c2.getNumber());

	}
}

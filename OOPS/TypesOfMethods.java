package com.corejava;

class Plane {

	void takeoff() {
		System.out.println("Plane is taking off");
	}

	void fly() {
		System.out.println("Plane is flying");
	}

	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {

	// takeoff() is already present because it is inherited methods

	void fly() { // overridden method
		System.out.println("CargoPlane fly at lower heights");
	}

	void carryCargo() {
		System.out.println("CargoPlane carries cargo");
	}

	// land() is already present because it is inherited methods
}

class PassengerPlane extends Plane {

	// takeoff() is already present because it is inherited methods

	void fly() {
		System.out.println("PassengerPlane flies at medium height");
	}

	void carryPassengers() { // specialized method
		System.out.println("PassengerPlane carries passengers");
	}

	// land() is already present because it is inherited methods
}

class FighterPalne extends Plane {

	// takeoff() is already present because it is inherited methods

	void fly() {
		System.out.println("FighterPalne flies at greater height");
	}

	void carryWeapons() { // specialized method
		System.out.println("FighterPalne carries weapons");
	}

	// land() is already present because it is inherited methods
}

public class TypesOfMethods {

	public static void main(String[] args) {

		CargoPlane c = new CargoPlane();
		c.takeoff();
		c.fly();
		c.carryCargo();
		c.land();

		System.out.println();

		PassengerPlane p = new PassengerPlane();
		p.takeoff();
		p.fly();
		p.carryPassengers();
		p.land();

		System.out.println();

		FighterPalne f = new FighterPalne();
		f.takeoff();
		f.fly();
		f.carryWeapons();
		f.land();
	}

}

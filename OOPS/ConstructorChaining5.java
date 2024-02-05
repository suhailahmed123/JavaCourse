class User {
	public User() {
		System.out.println("User");
	}

}

class RegularUser extends User {
	public RegularUser() {
		System.out.println("RegularUser");
	}
}

class PremiumUser extends RegularUser {
	public PremiumUser() {
		System.out.println("PremiumUser");
	}
}

public class ConstructorChaining5 {

	public static void main(String[] args) {

		PremiumUser pu = new PremiumUser();
	}

}

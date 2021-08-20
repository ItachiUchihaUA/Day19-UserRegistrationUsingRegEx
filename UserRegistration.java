
public class UserRegistration {

	public static void main(String[] args) {
		System.out.println(checkPassword("Asd@f6rtrtyytyhjka"));
	}

	public static boolean checkFirstName(String s) {
		return s.matches("[A-Z][A-Za-z]{2,}");
	}

	public static boolean checkLastName(String s) {
		return s.matches("[A-Z][A-Za-z]{2,}");
	}

	public static boolean checkEmail(String s) {
		return s.matches("[A-Za-z][A-Za-z0-9.-_]*@[a-z]+.[a-z]{2,3}.[a-z]{2,3}");
	}

	public static boolean checkPhone(String s) {
		return s.matches("[0-9]{2,3}[ ][0-9]{10}");
	}

	public static boolean checkPassword(String s) {
		return s.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}");
	}
}

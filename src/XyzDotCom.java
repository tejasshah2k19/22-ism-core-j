
public class XyzDotCom {

	public static void main(String[] args) {
		String email = "a@yopmail.com";
		String password = "a";

		GoogleApi gApi = new GoogleApi();
		try {
			System.out.println(gApi.login(email, password));
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}
}

class GoogleApi {
	public boolean login(String email, String password) {
		//
		if (email.length() == 0)
			throw new InvalidEmailException();

		if (!email.contains("gmail"))
			throw new InvalidEmailException("412 : Please Use Gmail Account");
		if (!email.contains("."))
			throw new InvalidEmailException("Please Use Valid Email");

		if (email.equalsIgnoreCase("a@a.com") && password.equals("a")) {
			return true;
		} else {
			return false;
		}
	}
}

//1) parent -> Exception 
//2) errorMessage -> parent
class InvalidEmailException extends RuntimeException {
	public InvalidEmailException() {
		super("420 : Please Enter Email");// constructor
	}

	public InvalidEmailException(String msg) {
		super(msg);
	}

}

//

//

//

//

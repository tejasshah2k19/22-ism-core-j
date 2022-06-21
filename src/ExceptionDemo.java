import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Object
public class ExceptionDemo {

	void add() {
	}

	public static void main(String[] args) throws IOException {
		Scanner scr = new Scanner(System.in);

		int a, b, c = 0;
		// DRY
		try {
			// db open
			System.out.println("Enter two numbers");
			a = scr.nextInt();
			b = scr.nextInt();
			if (b == 0) {
				throw new ArithmeticException();
			}
			c = a / b;
			// deduct
			System.out.println("Div => " + c);

		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zeron in second number...");
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please Enter only integers...");
//			e.printStackTrace();
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			System.out.println("something went wrong PTA");
			// sendEmailToDevel(e.printStackTrace());
		} finally {
			System.out.println("----finally----");
			// close
		}
		System.out.println("done");

		// try
		// hit
		// throw throw new XXX()
		// catch

		File f = new File("ram.txt");
		f.createNewFile();

	}
}

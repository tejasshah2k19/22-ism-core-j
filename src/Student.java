import java.util.Scanner;

public class Student {
	int studentId;
	String name;
	String email;
	String password;

	Student() {
		studentId = (int) (Math.random() * 10000000); // 00020656.231465321546212
	}

	void input() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name email and password");
		name = scr.next();
		email = scr.next();
		password = scr.next();
	}

	void print() {
		System.out.println(studentId + "\t" + name + "\t" + email + "\t" + password);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.input();
		s.print();
	}
}

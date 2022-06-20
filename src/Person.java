import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private String gender;
	private int salary;

	public Person() {
		this.salary = 10000;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void input() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter firstName lastName and Gender");
		firstName = scr.next();
		lastName = scr.next();
		gender = scr.next();
	}

	public void print() {
		System.out.println(firstName + "   " + lastName + "    " + gender + "   " + salary);
	}

	public static void main(String[] args) {

		Person p[] = new Person[10];

		for (int i = 0; i < 3; i++) {
			p[i] = new Person();
			p[i].input();
		}
		System.out.println("firstName LastName Gender");
		for (int i = 0; i < 3; i++) {
			p[i].print();
		}
		p[0].setFirstName("laxman");
		p[1].setLastName("laxman");
		p[2].setGender("laxman");

		System.out.println("after setters");
		System.out.println("firstName LastName Gender");
		for (int i = 0; i < 3; i++) {
			p[i].print();
		}

		p[0].setSalary(15000);
		p[2].setSalary(35000);

		//

	}
}

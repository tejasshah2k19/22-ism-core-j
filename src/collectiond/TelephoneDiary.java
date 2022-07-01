package collectiond;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneDiary {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1);//hashcode ? why? 
		System.out.println(p1.toString());
		
		
		
		
		
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println(
					"\n0 For Exit\n1 For Add Contact\n2 For List\n3 For Search\n4 For Remove \n5 For Update \nEnter choice");
			int ch = scr.nextInt();

			switch (ch) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("Enter firstname lastname and contat number");
				Person p = new Person();
				p.setFirstName(scr.next());
				p.setLastName(scr.next());
				p.setContactNumber(scr.next());
				list.add(p);
				System.out.println("contact added ");
				break;
			case 2:
				System.out.println(list);
			}
		}
	}
}

class Person {
	private String firstName;
	private String lastName;
	private String contactNumber;

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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String toString(){
		return firstName;
	}
}

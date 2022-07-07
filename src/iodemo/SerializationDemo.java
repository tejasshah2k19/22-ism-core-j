package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.border.EmptyBorder;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee();
		e1.setEmpName("ram");
		e1.setSalary(1200000);
		e1.setSecretCode("ram123");
		System.out.println(e1);
		File f = new File("serial.txt");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(e1);// id name sala seccod address
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		Employee e2 = (Employee) ois.readObject();
		ois.close();

		System.out.println(e2);

	}
}

class Address implements Serializable {
	//
	//
	//

	State state = new State();
}

class State implements Serializable {

}

class PartTimeEmp extends Employee {

}

class Employee implements Serializable {
	private int empId;
	private String empName;
	private int salary;
	transient private String secretCode;

	Address address = new Address();

	public Employee() {
		this.empId = (int) (Math.random() * 10000000);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}

	@Override
	public String toString() {
		return this.empId + " " + this.empName + " " + this.salary + " " + this.secretCode;
	}
}
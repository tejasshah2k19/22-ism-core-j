
public class DefaultValue {
	// 8 primitive --> byte short char int long float double boolean
	// object -> null
	int a;// 0
	char c;// '\0'
	float f;// 0.0
	long l;// 0
	boolean b;// false
	// constructor -->
	// implicit --> default constructor
	// explicit
	// 1 - default constructor -- no argument
	// 2 - parameterized -- argument

	void print() {
		System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		System.out.println(l);
		System.out.println(b);
	}

	public static void main(String[] args) {
		DefaultValue df = new DefaultValue();
		df.print();

		Employee ram = new Employee();
		ram.name = "ram";
		Employee khasEmployee = new Employee(35000);
		System.out.println(ram.salary);
		System.out.println(khasEmployee.salary);
	}
}

class Employee {
	int salary;
	String name;

	//
	public Employee() {
		salary = 25000;
	}

	public Employee(int initAmount) {
		salary = initAmount;
	}

	void increment(int amt) {
		salary = salary + amt;
	}
}

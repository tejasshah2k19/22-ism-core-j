import java.util.ArrayList;
import java.util.Collections;

public class FunctionalDemo {

	public static void main(String[] args) {
		Developer d1 = new Developer("ram", 15000, 1);
		Developer d2 = new Developer("sita", 12000, 2);
		Developer d3 = new Developer("ravan", 20000, 6);
		Developer d4 = new Developer("laxman", 10000, 4);

		ArrayList<Developer> developers = new ArrayList<Developer>();
		developers.add(d1);
		developers.add(d2);
		developers.add(d3);
		developers.add(d4);

		System.out.println(developers);
		Collections.sort(developers);// how to sort? ? Comparable or Comparator ?
		System.out.println(developers);

		System.out.println("******************");
		Collections.sort(developers, (Developer x, Developer y) -> {
			if (x.salary > y.salary) {
				return -1;
			} else if (x.salary < y.salary) {
				return 1;
			}
			return 0;
		});
		System.out.println(developers);

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("thread.........");
			}
		};

	}
}

//class Developer {
//	String name;
//	int salary;
//	int rank;
//
//	public Developer(String name, int salary, int rank) {
//		this.salary = salary;
//		this.name = name;
//		this.rank = rank;
//	}
//
//	@Override
//	public String toString() {
//		return name + ":" + salary + ":" + rank;
//	}
//
//}

//
class Developer implements Comparable<Developer> {
	String name;
	int salary;
	int rank;

	public Developer(String name, int salary, int rank) {
		this.salary = salary;
		this.name = name;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return name + ":" + salary + ":" + rank;
	}

	@Override
	public int compareTo(Developer o) {

		if (this.salary > o.salary)
			return 1;
		else if (this.salary < o.salary)
			return -1;
		else
			return 0;
	}
}

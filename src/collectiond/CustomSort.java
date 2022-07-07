package collectiond;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(20);
		intList.add(120);
		intList.add(220);
		intList.add(-20);
		intList.add(10);
		System.out.println(intList);

		Collections.sort(intList);// asc
//		Collections.reverse(intList);
		System.out.println(intList);

		Laptop l1 = new Laptop("Legion y 520", 120000);
		Laptop l2 = new Laptop("Ausa a 250", 110000);
		Laptop l3 = new Laptop("Msi  GF 66 ", 130000);
		Laptop l4 = new Laptop("Dell y 520", 120000);
		Laptop l5 = new Laptop("Docket y 520", 120000);

		ArrayList<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);// l1.compareTo(l2);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		System.out.println(list);
		Collections.sort(list);// how to sort ?
		System.out.println(list);

	}
}

class Laptop implements Comparable<Laptop> {
	int price;
	String name;

	public Laptop(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	// 0 same
	@Override
	public int compareTo(Laptop o) { // o -> l2

//		if (this.price > o.price) {
//			return -1;// l1
//		} else if (this.price < o.price) {
//			return 1;
//		}
//		return 0;
//		return this.price - o.price;//0 1 -1 
//		return o.price  - this.price;
		return this.name.trim().compareTo(o.name.trim());// equals compareTo + - 0
	}

}

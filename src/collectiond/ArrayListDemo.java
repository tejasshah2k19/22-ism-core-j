package collectiond;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// 25-25 == 0 grow(25)
		// 25 + 12.5 => 37
		list.add(20);
//		list[1] ="royal";
		list.add("royal");
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		System.out.println(list.get(0));

		int x = (int) list.get(0);
		list.remove(0);// 0 index
		System.out.println(list);
		list.remove((Integer) 20);// element
		list.remove("royal");//
		System.out.println(list);

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
//		numbers.add("two");
		System.out.println(numbers);

		int y = numbers.get(0);
		numbers.add(new Integer(55));
		Integer ix = new Integer(250);
		numbers.add(ix);

		numbers.add(100);// new Integer(100)

		System.out.println(ix);
		System.out.println(numbers.get(2));

		int ram = 10;
		Integer ravan = 10;
		if (ram == ravan.intValue()) {
			System.out.println("Same");
		}
		System.out.println(numbers.contains(25000));
		System.out.println("new");
		ArrayList<Integer> allNum = new ArrayList<Integer>(2);// 2
		allNum.add(12);// 0 = i
		allNum.add(-12);// 1
		allNum.add(120);// 2
		allNum.add(1200);// 3
		allNum.add(-121);// 4

		// print and remove => all
		int size = allNum.size();
		for (int i = 0; i < size; i++) {
			System.out.println(allNum.get(0));
			allNum.remove(0);
		}

	}

}

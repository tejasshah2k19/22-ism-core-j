package collectiond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CustomSort2 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(20);
		intList.add(120);
		intList.add(220);
		intList.add(-20);
		intList.add(10);
		System.out.println(intList);
//		Collections.sort(intList);// 20.compareTo(120);
		IntegerCustomSort i = new IntegerCustomSort();
		Collections.sort(intList, i);// i.compare(20,120)
		System.out.println(intList);

		Mouse m1 = new Mouse();
		TreeSet<Mouse> ts = new TreeSet<Mouse>();
		ts.add(m1);
		System.out.println(ts);// sorted
		Keyboard k = new Keyboard();
		PriorityQueue<Keyboard> pq = new PriorityQueue<Keyboard>();
		pq.add(k);
		System.out.println(pq);
		pq.poll();
	}
}

class IntegerCustomSort implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}

class Keyboard {

}

class Mouse implements Comparable<Mouse> {

	@Override
	public int compareTo(Mouse o) {
		return 0;
	}

}
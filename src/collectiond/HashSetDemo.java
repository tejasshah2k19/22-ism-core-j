package collectiond;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// unSorted
		HashSet<Integer> hs = new HashSet<Integer>();
//		TreeSet<Integer> hs = new TreeSet<Integer>();
		// TreeSet -> Sorted

		hs.add(10);// HashMap
		hs.add(20);
		hs.add(-30);
		hs.add(40);
		hs.add(-50);
		hs.add(60);
		hs.add(5);
		hs.add(60);
		System.out.println(hs);
		hs.remove(60);
		System.out.println(hs);
		System.out.println(hs.remove(60));
		System.out.println(hs.contains(60));

		System.out.println("print sinle-->");
		// print
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());//
		}

	}
}

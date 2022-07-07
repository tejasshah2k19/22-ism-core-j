package util;

import java.util.ArrayList;

public class SeatingNumber {

	static int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length;) {
			int index = (int) (Math.random() * 100);
			if (index >= 0 && index < a.length && !list.contains(a[index])) {
				System.out.print(a[index] + " ");
				i++;
				list.add(a[index]);
			}

		}
	}
}

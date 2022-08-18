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
//2 3 13 8 5 12 1 6 10 9 14 4 7 11 
//5 8 12 1 10 9 7 11 2 13 6 3 14 4 
//2 15 9 5 10 6 7 3 11 1 4 12 8 13 14 


//project group 
//10 1 12, 3 2 4, 13 6 11, 5 8 14, 9 7 
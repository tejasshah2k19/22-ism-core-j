
public class ArrayRightShift {

	int a[] = { 1, 2, 3, 4, 5 };

	void print() {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	void rightShift(int countShift) {// 2
		int i = 1;
		while (i <= countShift) {
			int last = a[a.length - 1];// 5
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1]; //
			}
			a[0] = last;
			i++;
		}
	}

	void rightShiftRecur(int countShift) {// 1

		int last = a[a.length - 1];// 1 2 3 4 5 -> 5 1 2 3 4 -> 4 5 1 2 3
		for (int j = a.length - 1; j > 0; j--) {
			a[j] = a[j - 1]; //
		}
		a[0] = last;
		countShift--;// 0
		if (countShift != 0) {
			rightShift(countShift);// 1
		}
	}

	public static void main(String[] args) {
		ArrayRightShift ar = new ArrayRightShift();
		ar.print();
		System.out.println("");
		ar.rightShift(2);
		ar.print();
		System.out.println("\n******************\n");

		ArrayRightShift ar2 = new ArrayRightShift();
		ar2.print();
		System.out.println("");
		ar2.rightShiftRecur(2);
		ar2.print();

	}
}

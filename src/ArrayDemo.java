
public class ArrayDemo {
	void oneD() {
		int a[];// a -> array --> int
		a = new int[10];
		int b[] = new int[5];// 5 -> user scan

		int[] c = new int[5];// 5 -> user scan

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 10;// 0 size-1
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	void twoD() {

		int a[][] = new int[3][3];// row col ->r*c -> 9 int --> 9*4 -> 36byte
		int[][] b = new int[3][3];// row col ->r*c -> 9 int --> 9*4 -> 36byte

		int[] c[] = new int[3][3];// row col ->r*c -> 9 int --> 9*4 -> 36byte

		for (int i = 0; i < a.length; i++) {// 3
			for (int j = 0; j < a[i].length; j++) {// column
				a[i][j] = a.length * 10 + (i + j);
			}
		}
		for (int i = 0; i < a.length; i++) {// 3
			for (int j = 0; j < a[i].length; j++) {// column
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		// torrent
		int a[][] = new int[4][];
		a[0] = new int[5];
		a[1] = new int[2];
		a[2] = new int[10];
		a[3] = new int[15];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = 10 + (i + j);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}
}

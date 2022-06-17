
//student - ism empl - raja - bhai - ben - s d - overload 
public class StringBufferBuilder {

	// overloading
	void add(int a, int b) {

	}

	void add(float a, float b) {

	}

	void add(char x, char y) {

	}

	public static void main(String[] args) {

		// "royal" --> char[]
		// String
		// mutable
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb);
		sb.append("edu");
		System.out.println(sb);
		// sb --> royal
		// sb --> royaledu

		System.out.println(sb.reverse());

	}

	static void demoBuilder() {
		StringBuilder sb = new StringBuilder("royal");
		System.out.println(sb);
		sb.append("edu");
		System.out.println(sb);
		// sb --> royal
		// sb --> royaledu

		System.out.println(sb.reverse());
	}
}

import java.util.Scanner;

interface D11 {
	void add();
}

class A11 {
	public void add() {
		System.out.println("add()");
		Scanner scr = null;
	}
}

class Qst extends A11 implements D11 {

	public static void main(String[] args) {
//		Qst  c = new Qst();
//		c.add();

		D11 d = new Qst();
		d.add();
		A11 a = new Qst();
		a.add();
	}
}
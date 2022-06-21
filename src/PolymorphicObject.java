
public class PolymorphicObject {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		Child1 c = new Child1();

		p.add();
		c.add();
		c.sub();

		System.out.println("*******************");
		Parent1 pc = new Child1();// Parent p = new Child();
		pc.add();
		pc.sub();
//		pc.mul();
		
//		Child1 cp = (Child1)new Parent1();
	}
}

class Parent1 {
	void add() {
		System.out.println("add Parent1");
	}

	void sub() {
		System.out.println("sub Parent1");
	}
}

class Child1 extends Parent1 {
	void add() {
		System.out.println("add Child1");
	}

	void mul() {
		System.out.println("mul Child1");
	}
}


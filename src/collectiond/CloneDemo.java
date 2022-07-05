package collectiond;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bank b = new Bank();
//		b.clone();
		b.sub();
		b.add();
		b.mul();

	}
}

class Bank extends ParentA {
	int x = 100;

	void add1() {
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void sub() {
		add();
		mul();
	}

}

class ParentA {
	public void add() {

	}

	protected void mul() {

	}
}

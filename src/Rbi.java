
public class Rbi {
	void wid() {
		System.out.println("wid()::RBI");// 5000
	}

	final void calcInterest() {
		System.out.println("calcInt()");
	}

	void checkBal() {

	}

	public static void main(String[] args) {
		Icici i = new Icici();
		i.wid();
		i.calcInterest();
	}
}

class Icici extends Rbi {
	// overriding
	protected void wid() {
		System.out.println("wid()::ICICI");// 50000
		//wid()
	}

	// overloading
	void wid(int charge) {
		System.out.println("wid()::ICICI");// 50000
	}

	// overloading
	void wid(String extCharge) {
		System.out.println("wid()::ICICI");// 50000
	}

	void checkBal(int x) {
	}
}

import collectiond.ParentClass;

public class AccessParentA {

	public static void main(String[] args) {
		A a = new A();
//		a.mul();
		a.div();

	}
}

class A extends ParentClass {

	void seeInParent() {
//		add(); //private
//		sub(); //default 
		mul();
		div();
	}
}
//is a 
//B extends ParentCLass 
class B {
	ParentClass p = new ParentClass();

	void seeInParent() {
		p.div();
	}
}
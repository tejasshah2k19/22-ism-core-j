
public class Calc {
	protected void add() {
		System.out.println("add()");
	}

	void sub() {
		System.out.println("sub()");
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		c.add();
		c.sub();
		SciCalc sc = new SciCalc();
		sc.cos();
		sc.sin();
		sc.add();
	}
}

//inh -> object of one class can access property of another class 

//parent super base  
//child  sub   derived 
class SciCalc extends Calc {
	void sin() {
		System.out.println("sin()");
	}

	void cos() {
		System.out.println("cos()");
	}
}
//parent -- child 

//single level 
//Parent 

//Child 

//multi level 
//Grand Parent 

//Parent

//Child 

//Multiple 
//Parent 	parent 
//		Child 

//				Parent 
//		  C		   C		C		C 
//    c1     c2  c3   c4 

//hybrid 
//A    D 

//B

//C 

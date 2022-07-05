package collectiond;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		ArrayList t = new ArrayList();
		ArrayList<Integer> t1 = new ArrayList<>();
		ArrayList<Float> t2 = new ArrayList<Float>();

		Calc<Integer> c = new Calc();
		c.setA(20);
		c.setB(30);
		System.out.println(c.getA() + c.getB());

		Calc<Float> f = new Calc();
		f.setA(20.30f);
		f.setB(30.30F);
		System.out.println(c.getA() + c.getB());
		CalcDouble<Integer, String> cd = new CalcDouble<>();

//		Calc<String> x = new Calc();
		// ?
	}
}

class CalcDouble<T, K> {
	T a;
	K b;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public K getB() {
		return b;
	}

	public void setB(K b) {
		this.b = b;
	}

}

class Calc<T extends Number> {
	T a, b;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

}

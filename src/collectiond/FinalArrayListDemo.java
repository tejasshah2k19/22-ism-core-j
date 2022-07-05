package collectiond;

import java.util.ArrayList;

public class FinalArrayListDemo {

	public static void main(String[] args) {
		final ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);//yes you can add 
		System.out.println(list); //
//		list = new ArrayList<Integer>(); //you cant cz its final if its not final then u can 
	}
}

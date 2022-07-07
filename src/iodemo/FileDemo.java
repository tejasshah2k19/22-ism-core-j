package iodemo;

import java.io.File;
import java.io.IOException;

//
//nio 
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// to deal with file we have to use File

		File f = new File("demo.txt");// logical link
		File t = new File("d:\\Temp\\demo.txt");// logical link

		System.out.println(t.exists());
		// t.createNewFile(); //boolean
		// t.delete();//boolean
		long l = t.length();
		System.out.println(l);// byte long

		File md = new File("d:\\Temp\\ism");
		md.mkdir(); // boolean
		File mdh = new File("d:\\Temp\\ism\\2022\\java");
		mdh.mkdirs(); // boolean

		mdh.delete();// boolean
		String s[] = mdh.list();
		//renameTo
	}
}

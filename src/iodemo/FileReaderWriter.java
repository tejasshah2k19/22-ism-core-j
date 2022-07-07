package iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		File f = new File("demo.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("royaleducation");
		fw.close();
		
		long l = f.length();
		char data[]= new char[(int)l];
		FileReader fr = new FileReader(f);
		
		fr.read(data);
		fr.close();
		
		System.out.println(data);//print [r o y ]
		int a[] = {1,2,3,4,5};

		System.out.println(a);	
			
		String s = new String(data);//char array -> string 
		
		
		
	}
}

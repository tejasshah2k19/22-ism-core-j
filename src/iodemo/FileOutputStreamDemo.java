
package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("d:\\Temp\\numbers.txt");

		FileOutputStream fos = new FileOutputStream(f);// file not found --> create -> overwrite
		fos.write('x');//
		fos.write('x');//
//		fos.write(b, off, len);
		fos.close();

		FileInputStream fis = new FileInputStream(f);

		while (true) {
			int b = fis.read();// first character read --> ascii
			if(b == -1) {
				break;
			}
			System.out.println((char)b);//explicit
		
		}
		fis.close();

	}
}

package iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("numbers.txt");// current folder
		Scanner scr = new Scanner(System.in);

		PrintWriter pw = new PrintWriter(f);
		for (int i = 1; i <= 5; i++) {
			System.out.println("enter number");
			int num = scr.nextInt();
			pw.println(num);
		}
		pw.close();

		BufferedReader br = new BufferedReader(new FileReader(f));
		while (true) {
			String str = br.readLine();
			if (str == null)
				break;
			
//			int x = (Integer)str;
			if (Integer.parseInt(str) % 2 == 0) {
				System.out.println(str + " even");
			} else {
				System.out.println(str + " odd");
			}
//			System.out.println(str);
		}
		br.close();
	}
}

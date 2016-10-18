package file_test;

import java.io.*;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException {
		int count = 0;
		
		Scanner input = new Scanner(new File("input.txt"));

		System.out.println();
		
		while (input.hasNextInt()) {
			
			System.out.print(input.nextInt() + "\t");
			count++;
			if (count % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println(count + " total integers found.");
		
	}

}

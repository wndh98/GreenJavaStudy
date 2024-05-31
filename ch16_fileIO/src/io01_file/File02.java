package io01_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class File02 {
	public static void main(String[] args) throws IOException {
		File file = new File("e:/kjo/temp/file1.txt");
		try {
			Scanner sc1 = new Scanner(file, "utf-8");
			while (sc1.hasNext()) {
				String string = (String) sc1.nextLine();
				System.out.println(string + " ");
			}

			sc1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("절대경로: " + file.getAbsolutePath());
		System.out.println("표준경로: " + file.getCanonicalPath());
		System.out.println("경로: " + file.getPath());
		System.out.println("Parent: " + file.getParent());
		System.out.println("length: " + file.length());
		System.out.println("read: " + file.canRead());
		System.out.println("write: " + file.canWrite());
		System.out.println("execute: " + file.canExecute());

		System.out.println("최종수정: " + file.lastModified());
		SimpleDateFormat sdf =
				// new SimpleDateFormat("yyyy/MM/dd a hh/mm/ss");
				new SimpleDateFormat("EEE, MMM d, ''yy ");
		System.out.println(sdf.format(new Date(file.lastModified())));

	}

}

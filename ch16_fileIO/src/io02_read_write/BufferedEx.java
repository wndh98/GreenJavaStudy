package io02_read_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedEx {
	public static void main(String[] args) throws IOException {
		String path = "today.txt";

//		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
//		bw.close();

		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String line = "";
		
		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
	}
}

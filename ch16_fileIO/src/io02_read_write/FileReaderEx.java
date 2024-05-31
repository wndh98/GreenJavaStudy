package io02_read_write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		File file = new File("today.txt");
		FileReader fr = new FileReader(file);

		// 읽어들은 글자 수 저장할 변수
		int readCharNo;
		// 읽어온 글자를 넣을 변수
		String data = null;
		// 읽어온 글자가 들어갈 문자 배열 변수
		char[] buffer = new char[100];

		while ((readCharNo = fr.read(buffer))!=-1) {
			
			data=new String(buffer, 0, readCharNo);
		}
		System.out.println(data);

	}
}



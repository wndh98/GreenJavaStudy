package io03_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
	public static void main(String[] args) throws IOException {
		// main 메소드 어디에서나 참조 가능하도록 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		fis = new FileInputStream("0.jpg");
		bis = new BufferedInputStream(fis);

		fos = new FileOutputStream("apple.jpg");
		bos = new BufferedOutputStream(fos);
		int data;
		// buffered 를 사용하는게더 빠르다
//		while ((data = bis.read()) != -1) {
		while ((data = fis.read()) != -1) {
			fos.write(data);
		}
//		bos.flush();
		fos.flush();
		System.out.println("복사완료");
		fos.close();
		bis.close();
		fis.close();
		bos.close();

	}
}

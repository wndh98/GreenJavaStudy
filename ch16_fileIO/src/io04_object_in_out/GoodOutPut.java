package io04_object_in_out;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GoodOutPut{


	public static void main(String[] args) {
		// BookInfo 객체 생성
		BookInfo bi01 = new BookInfo("1111", 20000, "행복", "tom", 300);
		BookInfo bi02 = new BookInfo("2222", 30000, "돈 버는 자바", "jane", 150);
		BookInfo bi03 = new BookInfo("3333", 17000, "꿈 꾸는 뱀", "steve", 233);

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
			oos.writeObject(bi01);
			oos.writeObject(bi02);
			oos.writeObject(bi03);
			
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



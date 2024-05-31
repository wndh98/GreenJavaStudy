package io04_object_in_out;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class GoodInput {

	public static void main(String[] args) {

		List<GoodInfo> list = new ArrayList<>();
		FileInputStream fis;
		try {
			fis = new FileInputStream("book.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			while(true) {
				GoodInfo gi = (GoodInfo) ois.readObject();
				list.add(gi);
				System.out.println(gi);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
			list.stream().forEach(System.out::println);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(list);

	}

}

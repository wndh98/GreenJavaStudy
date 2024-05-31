package io01_file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class File01 {
	public static void main(String[] args) throws IOException, URISyntaxException {

		// File 객체: 처리할 파일의 경로를 저장

		File file1 = new File("e:\\kjo\\temp");
		System.out.println(file1);
		File file2 = new File("e:/kjo/temp");
		System.out.println(file2);
		File file3 = new File("e:\\kjo\\temp\\file1.txt");
		System.out.println(file3);
		System.out.println(file2.exists());
		System.out.println(file3.exists());
		if (!file2.exists()) {
			file2.mkdir();
		}
		if (!file3.exists()) {
			file3.createNewFile();
		}

		String fileName = "e:/kjo/temp/abc def/a.txt";
		URI uri = new URI("file:///" + fileName.replaceAll(" ", "%20"));
		System.out.println(uri);
		File file4 = new File(uri);
		if (!file4.exists()) {
			file4.createNewFile();
		}

		System.out.println("-----------------");
		// 해당 경로의 파일 목록 생성
		File[] contents = file1.listFiles();
		System.out.println(Arrays.toString(contents));
		System.out.println("-----------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH-mm");
		for (File f : contents) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if (f.isDirectory()) {
				System.out.print("\t<DIR>\t" + f.getName());
			} else {
				System.out.print("\t\t" + f.length() + "  " + f.getName());
			}
			System.out.println();
		}

		System.out.println("------------------------------");

		String dir = "e:/kjo/JavaStudy";
		File file = new File(dir);
		if (file.exists() && file.isDirectory()) {
			File[] arr = file.listFiles();

			System.out.println("===============================");
			System.out.println("     Files from " + file);
			System.out.println("===============================");

			recursivePrint(arr, 0, 0);
		}

	}

	private static void recursivePrint(File[] arr, int index, int level) {
		// 파일, 디렉터리가 더 이상 없으면 종료
		if (arr.length == index) {
			return;
		}
		// 레벨에 따라 들여쓰기
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		if (arr[index].isFile()) {
			System.out.println(arr[index].getName());
		} else if (arr[index].isDirectory()) {
			System.out.println("[DIR] " + arr[index].getName());
			recursivePrint(arr[index].listFiles(), 0, level + 1);
		}

		recursivePrint(arr, ++index, level);

	}

}

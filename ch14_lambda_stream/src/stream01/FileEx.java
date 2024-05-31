package stream01;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileEx {
	public static void main(String[] args) {
		File[] fileArr = {
		         new File("Ex1.java"),   
		         new File("Ex1.bak"),   
		         new File("Ex2.java"),   
		         new File("Ex1"),   
		         new File("Ex1.txt")   
		      };
		System.out.println(Arrays.stream(fileArr).count());
		Arrays.stream(fileArr).forEach(x->System.out.println(x));
		
		System.out.println("--------------");
		Stream
		.of(fileArr) // 스트림으로 만들기
		.map(File::getName)// 파일 객체의 이름 빼고
		.filter(t -> t.indexOf('.')!=-1) // 이름에 . 없는 애 제외
		.map(t->t.substring(t.indexOf('.')+1)) // .뒤부터 하나 잘라내기
		.map(String::toUpperCase) // 대문자로 변경
		.distinct() // 중복제거
		.forEach(System.out::println); // 출력
		
		
	}
}




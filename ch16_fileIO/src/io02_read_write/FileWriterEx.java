package io02_read_write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		File file = new File("today.txt");
		FileWriter fileWriter = new FileWriter(file);
		
		fileWriter.write("테스트입니다1. 테스트입니다2. \r\n");
		fileWriter.write("테스트입니다3. 테스트입니다4. \r\n");
		fileWriter.write("테스트입니다5. 테스트입니다6. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다8. 테스트입니다9. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.write("테스트입니다7. 테스트입니다8. \r\n");
		fileWriter.append("test");
		fileWriter.flush();
		fileWriter.close();
		System.out.println("파일 저장 완료");

	}
}

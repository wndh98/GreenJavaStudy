package api06_format;

import java.text.MessageFormat;

public class MessageFormat01 {

	public static void main(String[] args) {
		String id = "java";
		String name = "spark";
		String tel = "000-111-2222";
		int age = 19;

		String result = "id: " + id + " / name: " + name + " / tel: " + tel;
		System.out.println(result);

		String msg = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		result = MessageFormat.format(msg, id, name, tel);
		System.out.println(result);
	}

}




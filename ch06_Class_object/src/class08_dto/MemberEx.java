package class08_dto;

import java.util.Scanner;

public class MemberEx {
	// Web Browser - 사용자 입력 및 처리 결과 확인 창
	public static void main(String[] args) {
		// 회원가입, 로그인, 로그아웃, 회원정보 보기, 회원 목록, 끝내기
		Scanner sc = new Scanner(System.in);
		MemberService memberService = MemberService.getInstance();

		boolean flag = true;
		String id;
		String password;
		String name;
		int age;

		int result = 0;

		while (flag) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println(" 회원가입(1) | 로그인(2) | 로그아웃(3) | 회원정보 보기(4) | 회원 목록(5) | 끝내기(6)");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("원하는 메뉴를 번호로 선택하시오 ㅋㅋㅋ >>> ");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("id >>> ");
				id = sc.nextLine();
				System.out.println("password >>> ");
				password = sc.nextLine();
				System.out.println("name >>> ");
				name = sc.nextLine();
				System.out.println("age >>> ");
				age = Integer.parseInt(sc.nextLine());
				result = memberService.regist(id, password, name, age);
				if (result == 1) {
					System.out.println("회원 가입 성공!!");
				} else {
					System.out.println("회원 가입 실패!!");
				}

				break;
			// login
			case 2:
				System.out.println("id >>> ");
				id = sc.nextLine();
				System.out.println("password >>> ");
				password = sc.nextLine();
				Member member = memberService.login(id, password);
				if (member != null) {
					System.out.println(member.getName() + "님, 환영합니다!!!");
				} else {
					System.out.println("id 혹은 비밀번호 오류입니다 ㅠㅠ.");
				}

				break;

			// logout
			case 3:
				System.out.println("id >>> ");
				id = sc.nextLine();
				result = memberService.logout(id);
				if (result == 1) {
					System.out.println("로그아웃 되었넹, 다시 또 오셈 ㅋㅋㅋ");
				} else {
					System.out.println(id + " 없음 ㅋㅋㅋ");
				}
				break;

			// 회원정보 조회
			case 4:
				System.out.println("id >>> ");
				id = sc.nextLine();
				member = memberService.selectOne(id);
				if (member != null) {
					System.out.println(member);
				} else {
					System.out.println(id + " 없음 ㅋㅋㅋ");
				}
				break;

			// 회원 목록
			case 5:
				System.out.println(">>>>>>>>>>> 회원목록 <<<<<<<<<<<<<");
				Member[] members = memberService.selectAll();
				for (Member m : members) {
					if (m != null) {
						System.out.println(m);
						System.out.println("----------------------------------");
					}
				}

				break;
			// 종료
			case 6:
				System.out.println("프로그램을 진짜 종료할 텨? y or n >>> ");
				String select = sc.nextLine();
				if (select.trim().toLowerCase().equals("y")) {
					flag = false;
				}
				break;

			default:
				System.out.println("1~6 사이의 숫자를 입력해라 ㅋㅋㅋ");
			}

		}

		System.out.println("program end. 데이터는 전부 없어질 것이다 ㅋㅋㅋㅋ");
		sc.close();
	}
}
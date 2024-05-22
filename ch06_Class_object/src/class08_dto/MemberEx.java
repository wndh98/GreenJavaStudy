package class08_dto;

import java.util.Scanner;

public class MemberEx {
	// Web Browser - ����� �Է� �� ó�� ��� Ȯ�� â
	public static void main(String[] args) {
		// ȸ������, �α���, �α׾ƿ�, ȸ������ ����, ȸ�� ���, ������
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
			System.out.println(" ȸ������(1) | �α���(2) | �α׾ƿ�(3) | ȸ������ ����(4) | ȸ�� ���(5) | ������(6)");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("���ϴ� �޴��� ��ȣ�� �����Ͻÿ� ������ >>> ");

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
					System.out.println("ȸ�� ���� ����!!");
				} else {
					System.out.println("ȸ�� ���� ����!!");
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
					System.out.println(member.getName() + "��, ȯ���մϴ�!!!");
				} else {
					System.out.println("id Ȥ�� ��й�ȣ �����Դϴ� �Ф�.");
				}

				break;

			// logout
			case 3:
				System.out.println("id >>> ");
				id = sc.nextLine();
				result = memberService.logout(id);
				if (result == 1) {
					System.out.println("�α׾ƿ� �Ǿ���, �ٽ� �� ���� ������");
				} else {
					System.out.println(id + " ���� ������");
				}
				break;

			// ȸ������ ��ȸ
			case 4:
				System.out.println("id >>> ");
				id = sc.nextLine();
				member = memberService.selectOne(id);
				if (member != null) {
					System.out.println(member);
				} else {
					System.out.println(id + " ���� ������");
				}
				break;

			// ȸ�� ���
			case 5:
				System.out.println(">>>>>>>>>>> ȸ����� <<<<<<<<<<<<<");
				Member[] members = memberService.selectAll();
				for (Member m : members) {
					if (m != null) {
						System.out.println(m);
						System.out.println("----------------------------------");
					}
				}

				break;
			// ����
			case 6:
				System.out.println("���α׷��� ��¥ ������ ��? y or n >>> ");
				String select = sc.nextLine();
				if (select.trim().toLowerCase().equals("y")) {
					flag = false;
				}
				break;

			default:
				System.out.println("1~6 ������ ���ڸ� �Է��ض� ������");
			}

		}

		System.out.println("program end. �����ʹ� ���� ������ ���̴� ��������");
		sc.close();
	}
}
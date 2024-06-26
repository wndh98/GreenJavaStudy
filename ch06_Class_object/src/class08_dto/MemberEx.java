package class08_dto;

import java.util.Scanner;

public class MemberEx {
	// Web Browser - 紫遂切 脊径 貢 坦軒 衣引 溌昔 但
	public static void main(String[] args) {
		// 噺据亜脊, 稽益昔, 稽益焼数, 噺据舛左 左奄, 噺据 鯉系, 魁鎧奄
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
			System.out.println(" 噺据亜脊(1) | 稽益昔(2) | 稽益焼数(3) | 噺据舛左 左奄(4) | 噺据 鯉系(5) | 魁鎧奄(6)");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("据馬澗 五敢研 腰硲稽 識澱馬獣神 せせせ >>> ");

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
					System.out.println("噺据 亜脊 失因!!");
				} else {
					System.out.println("噺据 亜脊 叔鳶!!");
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
					System.out.println(member.getName() + "還, 発慎杯艦陥!!!");
				} else {
					System.out.println("id 箸精 搾腔腰硲 神嫌脊艦陥 ばば.");
				}

				break;

			// logout
			case 3:
				System.out.println("id >>> ");
				id = sc.nextLine();
				result = memberService.logout(id);
				if (result == 1) {
					System.out.println("稽益焼数 鞠醸樫, 陥獣 暁 神疾 せせせ");
				} else {
					System.out.println(id + " 蒸製 せせせ");
				}
				break;

			// 噺据舛左 繕噺
			case 4:
				System.out.println("id >>> ");
				id = sc.nextLine();
				member = memberService.selectOne(id);
				if (member != null) {
					System.out.println(member);
				} else {
					System.out.println(id + " 蒸製 せせせ");
				}
				break;

			// 噺据 鯉系
			case 5:
				System.out.println(">>>>>>>>>>> 噺据鯉系 <<<<<<<<<<<<<");
				Member[] members = memberService.selectAll();
				for (Member m : members) {
					if (m != null) {
						System.out.println(m);
						System.out.println("----------------------------------");
					}
				}

				break;
			// 曽戟
			case 6:
				System.out.println("覗稽益轡聖 遭促 曽戟拝 冬? y or n >>> ");
				String select = sc.nextLine();
				if (select.trim().toLowerCase().equals("y")) {
					flag = false;
				}
				break;

			default:
				System.out.println("1~6 紫戚税 収切研 脊径背虞 せせせ");
			}

		}

		System.out.println("program end. 汽戚斗澗 穿採 蒸嬢霜 依戚陥 せせせせ");
		sc.close();
	}
}
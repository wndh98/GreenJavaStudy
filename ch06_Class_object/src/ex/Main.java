package ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int menu;
		Bank bank = Bank.getInstance();
		String acNo;
		int password;
		int balance;
		PersonalAccount currentAccount;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("==========================================");
			System.out.println("=                                        =");
			System.out.println("= 1.계좌생성 2.송금 3.저축 4.인출 5.잔액확인 6.종료  =");
			System.out.println("=                                        =");
			System.out.println("==========================================");
			menu = Integer.parseInt(sc.next());
			switch (menu) {
			case 1:
				System.out.println("사용하실 계좌번호를 입력해주세요.");
				acNo = sc.next();
				if (bank.accountCheck(acNo) != null) {
					System.out.println("이미 사용중인 계좌번호입니다. 처음부터 다시 시도해주세요.");
					break;
				}
				System.out.println("은행명을 입력해주세요.");
				String bankName = sc.next();
				System.out.println("소유자 명을 입력해주세요.");
				String onwer = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				password = sc.nextInt();
				System.out.println("초기자금을 입력해주세요.");
				balance = sc.nextInt();
				currentAccount = bank.setAccount(acNo, bankName, onwer, password, balance);
				System.out.println("생성이 완료되었습니다.");
				System.out.println(currentAccount);
				break;
			case 2:
				System.out.println("본인 계좌번호를 입력해주세요.");
				acNo = sc.next();
				currentAccount = bank.accountCheck(acNo);
				if (currentAccount != null) {
					System.out.println("비밀번호를 입력해주세요.");
					password = sc.nextInt();
					if (bank.checkPassword(currentAccount, password)) {
						System.out.println("송금하실 계좌를 입력해주세요.");
						String acNo2 = sc.next();
						PersonalAccount sendAccount = bank.accountCheck(acNo2);
						if (sendAccount != null) {
							System.out.println("송금하실 금액을 입력해주세요.");
							balance = sc.nextInt();
							if (currentAccount.getBalance() >= balance) {
								bank.sendMoney(currentAccount, sendAccount, balance);
								System.out.println("송금 되었습니다.");
								System.out.println(currentAccount);
								break;
							} else {
								System.out.println("잔액이 부족합니다.");
								break;
							}
						} else {
							System.out.println("없는 계좌번호 입니다. 다시 시도해주세요.");
							break;
						}
						
					}
					System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
					break;
				}
				System.out.println("없는 계좌번호입니다. 다시 시도해주세요.");

				break;
			case 3:
				System.out.println("본인 계좌번호를 입력해주세요.");
				acNo = sc.next();
				currentAccount = bank.accountCheck(acNo);
				if (currentAccount != null) {
					System.out.println("비밀번호를 입력해주세요.");
					password = sc.nextInt();
					if (bank.checkPassword(currentAccount, password)) {
						System.out.println("입금하실 금액을 입력해주세요.");
						balance = sc.nextInt();

						bank.sendMoney(currentAccount, balance);
						System.out.println("입금 되었습니다.");
						System.out.println(currentAccount);
						break;

					}
					System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
					break;
				}

				break;
			case 4:
				System.out.println("본인 계좌번호를 입력해주세요.");
				acNo = sc.next();
				currentAccount = bank.accountCheck(acNo);
				if (currentAccount != null) {
					System.out.println("비밀번호를 입력해주세요.");
					password = sc.nextInt();
					if (bank.checkPassword(currentAccount, password)) {
						System.out.println("출금하실 금액을 입력해주세요.");
						balance = sc.nextInt();
						if (currentAccount.getBalance() >= balance) {
							bank.sendMoney(currentAccount, balance * -1);
							System.out.println("출금 되었습니다.");
							System.out.println(currentAccount);
						}
						System.out.println("잔액이 부족합니다.");
						break;
					}
					System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
					break;
				}
				break;
			case 5:
				System.out.println("본인 계좌번호를 입력해주세요.");
				acNo = sc.next();
				currentAccount = bank.accountCheck(acNo);
				if (currentAccount != null) {
					System.out.println("비밀번호를 입력해주세요.");
					password = sc.nextInt();
					if (bank.checkPassword(currentAccount, password)) {
						System.out.println(currentAccount);
						break;
					}
					System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
					break;
				}
				System.out.println("없는 계좌번호입니다 다시 시도해주세요.");
				break;
			case 6:
				flag = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("1~6번 사이의 메뉴를 입력해주세요.");
			}

		}

		sc.close();
	}

}
// 
package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		List<BankDTO> clientlist = new ArrayList<BankDTO>();
		// Bank 클래스 타입 : 고객번호, 이름, 계좌번호, 잔고를 담고 있는 타입
		while (run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.고객등록(get, set | 2.고객등록(생성자) | 3.전체 고객리스트 출력 | 4.입금 | 5.출금 | 6.고객리스트 | 7.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				BankDTO client = new BankDTO();
				int clientNumber =clientlist.size() +1;
				System.out.print("이름> ");
				String name = sc.next();
				System.out.print("계좌> ");
				String accountNumber = sc.next();
				System.out.print("입금액> ");
				int balance = sc.nextInt();
				// 입력받은 값을 BankDTO 객체 필드값으로 저장
				client.setClientNumber(clientNumber);
				client.setName(name);
				client.setAccountNumber(accountNumber);
				client.setBalance(balance);
				// 한세트가 다 만들어지면 (필드값 세팅이 끝나면 ArrayList에 저장)
				clientlist.add(client);
				break;
			case 2:
				System.out.print("이름> ");
				name = sc.next();
				System.out.print("계좌> ");
				accountNumber = sc.next();
				System.out.print("입금액> ");
				balance = sc.nextInt();
				client = new BankDTO(0, name, accountNumber, balance);
				clientlist.add(client);
				break;
			case 3:
				for (int i = 0; i < clientlist.size(); i++) {
					System.out.println("-------고객명단-------");
					System.out.println(clientlist.get(i).getClientNumber());
					System.out.println(clientlist.get(i).getName());
					System.out.println(clientlist.get(i).getAccountNumber());
					System.out.println(clientlist.get(i).getBalance());
				}
				break;
			case 4:
				// get은 입력되는것을 보여주는 것 set 다시 입력하는것
				System.out.print("계좌를 입력하세요.");
				accountNumber = sc.next();
				System.out.print("예금액 : ");
				int deposit = sc.nextInt();
				for (int i = 0; i < clientlist.size(); i++) {
					if (accountNumber.equals(clientlist.get(i).getAccountNumber())) {
						System.out.println(clientlist.get(i).getBalance() + deposit);
						balance = clientlist.get(i).getBalance() + deposit;
						clientlist.get(i).setBalance(balance);
					} else {
						System.out.println("없는 계좌입니다.");
					}
				}
				break;
			case 5:
				System.out.print("계좌를 입력하세요.");
				accountNumber = sc.next();
				System.out.print("출금액 : ");
				int withdraw = sc.nextInt();
				for (int i = 0; i < clientlist.size(); i++) {
					if (accountNumber.equals(clientlist.get(i).getAccountNumber())) {
						if (withdraw <= clientlist.get(i).getBalance()) {
							System.out.println(clientlist.get(i).getBalance());
							balance = clientlist.get(i).getBalance() - withdraw;
							clientlist.get(i).setBalance(balance);
						} else
							System.out.println("잔고액이 부족합니다.");
					} else {
						System.out.println("없는계좌입니다.");
					}

				}
				break;
			case 6:
				for (int i = 0; i < clientlist.size(); i++) {
//					clientlist.get(i).setClientNumber(i+1);
					System.out.println(clientlist.get(i));
				}
				break;
			case 7:
				System.out.println("종료하겠습니다.");
				break;
			}
		}
		sc.close();

	}

}

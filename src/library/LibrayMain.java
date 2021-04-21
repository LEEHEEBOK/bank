package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrayMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BookDTO> BookList = new ArrayList<BookDTO>();
		List<ClientDTO> clientList = new ArrayList<ClientDTO>();
		LibrayService ls = new LibrayService();
		ClientDTO client =null;
		BookDTO book =null;
		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.회원등록 | 2.도서등록 | 3.도서대출 | 4.도서목록 | 5.회원목록 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
//				ClientDTO client = new ClientDTO();
//				int clientNumber = clientList.size() + 1;
//				System.out.print("이름 : ");
//				String name = scan.next();
//				System.out.print("전화번호 : ");
//				String Phone = scan.next();
//				client = new ClientDTO(clientNumber, name, Phone);
//				clientList.add(client);
				ls.clientlist(clientList);
				break;
			case 2:
//				BookDTO book = new BookDTO();
//				int bookNumber = bookList.size() + 1;
//				boolean check = false;
//				int clientnumber = 0;
//				System.out.print("도서명 : ");
//				String bookName = scan.next();
//				System.out.print("저자 : ");
//				String author = scan.next();
//				book = new BookDTO(bookNumber, bookName, author, check, clientnumber);
//				bookList.add(book);
				ls.booklist(BookList);
				break;
			case 3:
//				System.out.println("고객 번호 : ");
//				clientNumber = scan.nextInt();
//				System.out.println("대여책 번호 : ");
//				bookNumber = scan.nextInt();
//				for (int j = 0; j < bookList.size(); j++) {
//					for (int i = 0; i < bookList.size(); i++) {
//						if (bookList.get(i).isCheck() == false) {
//							bookList.get(i).setCheck(true);
//							bookList.get(i).setClientNumber(clientNumber);
//						}
//					}
//				}
				BookList = ls.revise(BookList);
				break;
			case 4:
//				for (int i = 0; i < BookList.size(); i++) {
//					System.out.println(BookList.get(i));
//				}
				ls.infob(BookList);
				break;
			case 5:
//				for (int i = 0; i < clientList.size(); i++) {
//					System.out.println(clientList.get(i));
//				}
				ls.infoc(clientList);
				break;
			case 6:
				System.out.println("종료하겠습니다.");
				break;
			}
		}

	}

}

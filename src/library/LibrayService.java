package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrayService {
	Scanner scan = new Scanner(System.in);

	public void clientlist(List<ClientDTO> ClientList) {
		ClientDTO Client = new ClientDTO();
		int ClientNumber = ClientList.size() + 1;
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("전화번호 : ");
		String Phone = scan.next();
		Client = new ClientDTO(ClientNumber, name, Phone);
		ClientList.add(Client);

	}

	public void booklist(List<BookDTO> bookList) {
		BookDTO book = new BookDTO();
		int bookNumber = bookList.size() + 1;
		boolean check = false;
		int Clientnumber = 0;
		System.out.print("도서명 : ");
		String bookName = scan.next();
		System.out.print("저자 : ");
		String author = scan.next();
		book = new BookDTO(bookNumber, bookName, author, check, Clientnumber);
		bookList.add(book);
	}

	public List<BookDTO> revise(List<BookDTO> BookList) {
		System.out.print("고객 번호 : ");
		int ClientNumber = scan.nextInt();
		System.out.print("대여책 번호 : ");
		int BookNumber = scan.nextInt();
		for (int j = 0; j < BookList.size(); j++) {
			if (BookNumber == BookList.get(j).getBookNumber() && BookList.get(j).isCheck() == false) {
				BookList.get(j).setClientNumber(ClientNumber);
				BookList.get(j).setCheck(true);
				System.out.println("대여완료했습니다..");
			} else if(BookNumber == BookList.get(j).getBookNumber() && BookList.get(j).isCheck() == true){
				System.out.println("대여중입니다.");

			}
		}
		return BookList;
	}

	public void infob(List<BookDTO> BookList) {
		for (int i = 0; i < BookList.size(); i++) {
			System.out.println(BookList.get(i));
		}
	}

	public void infoc(List<ClientDTO> ClientList) {
		for (int i = 0; i < ClientList.size(); i++) {
			System.out.println(ClientList.get(i));
		}
	}
	//게시판.
		/*
		 * CRUD
		 * -Create
		 * -Read
		 * -Update
		 * -Delete
		 * */
}


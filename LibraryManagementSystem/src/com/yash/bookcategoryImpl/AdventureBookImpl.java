package com.yash.bookcategoryImpl;

import java.util.List;
import java.util.Scanner;

import com.yash.bookcategory.BookCategory;
import com.yash.data.DataList;
import com.yash.domain.Book;

public class AdventureBookImpl implements BookCategory {

	@Override
	public Book getBookCategory(String category) {
		Book bookSearched = null;
		Scanner sc = new Scanner(System.in);
		DataList dataList = new DataList();

		List<Book> adventureBook = dataList.getAdventureBooks();
		adventureBook.forEach(bk -> {
			System.out.println("book name : " + bk.getName() + "  book Id: " + bk.getBid());
		});
		System.out.println();
		System.out.println("Enter Book Id: ");
		int id = sc.nextInt();
		bookSearched = adventureBook.stream().filter((bk) -> bk.getBid() == id).findAny().orElse(null);

		return bookSearched;
	}

}

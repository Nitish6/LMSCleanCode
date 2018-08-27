package com.yash.controller;

import java.util.Scanner;

import com.yash.bookcategory.BookCategory;
import com.yash.bookfactory.BookFactory;
import com.yash.domain.Book;

public class LibraryManagement {

	public static void getBookDetails() {
		Book requiredBook = null;
		String inputCategory = null;
		BookCategory requiredBookCategory = null;
		BookFactory bookFactory = new BookFactory();

		System.out.println("Enter Book Category");
		Scanner sc = new Scanner(System.in);
		inputCategory = sc.next();
		requiredBookCategory = bookFactory.getBookCategoryObject(inputCategory);
		requiredBook = requiredBookCategory.getBookCategory(inputCategory);
		displayBook(requiredBook);
	}

	private static void displayBook(Book book) {
		System.out.println("Book Name for searched id: " + book.getName());
	}
}

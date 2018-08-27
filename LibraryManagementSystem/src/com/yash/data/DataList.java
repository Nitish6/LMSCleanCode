package com.yash.data;

import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Book;

public class DataList {

	public List<Book> horrorBook = null;
	public List<Book> actionBook = null;
	public List<Book> adventureBook = null;
	public List<Book> scienceBook = null;

	public List<Book> getHorrorBooks() {
		horrorBook = new ArrayList<>();

		horrorBook.add(new Book(55, "Shirley"));
		horrorBook.add(new Book(60, "IT"));
		horrorBook.add(new Book(40, "Dracula"));

		return horrorBook;
	}

	public List<Book> getActionBooks() {
		actionBook = new ArrayList<>();

		actionBook.add(new Book(2, "Outlander"));
		actionBook.add(new Book(4, "Harry"));
		actionBook.add(new Book(1, "king"));

		return actionBook;
	}

	public List<Book> getAdventureBooks() {
		adventureBook = new ArrayList<>();

		adventureBook.add(new Book(95, "Spy"));
		adventureBook.add(new Book(30, "Island"));
		adventureBook.add(new Book(80, "the fire"));

		return adventureBook;
	}

	public List<Book> getScienceBooks() {
		scienceBook = new ArrayList<>();

		scienceBook.add(new Book(11, "C++"));
		scienceBook.add(new Book(12, "Java"));
		scienceBook.add(new Book(14, "C"));

		return scienceBook;
	}

}

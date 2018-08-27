package com.yash.bookfactory;

import com.yash.bookcategory.BookCategory;
import com.yash.bookcategoryImpl.ActionBookImpl;
import com.yash.bookcategoryImpl.AdventureBookImpl;
import com.yash.bookcategoryImpl.HorrorBookImpl;
import com.yash.bookcategoryImpl.ScienceBookImpl;

public class BookFactory {

	public BookCategory getBookCategoryObject(String category) {

		if (category.equals("action"))
			return new ActionBookImpl();
		else if (category.equals("horror"))
			return new HorrorBookImpl();
		else if (category.equals("science"))
			return new ScienceBookImpl();
		else
			return new AdventureBookImpl();
	}
}

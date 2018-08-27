package com.yash.domain;

public class Book {
	int bid;
	String name;

	public Book(int bid, String name) {
		this.bid = bid;
		this.name = name;
	}

	public int getBid() {
		return bid;
	}

	public String getName() {
		return name;
	}
}

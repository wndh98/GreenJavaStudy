package io04_object_in_out;

import java.io.Serializable;

public class BookInfo extends GoodInfo implements Serializable{
	
	String author;
	int page;

	public BookInfo() {
	}

	public BookInfo(String code, int price, String name, String author, int page) {
		super(code, price, name);
		this.author = author;
		this.page = page;
	}

	@Override
	public String toString() {
		return "BookInfo [author=" + author + ", page=" + page + 
				", code=" + code + ", price=" + price + 
				", name=" + name + "]";
	}
}

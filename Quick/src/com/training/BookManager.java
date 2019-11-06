package com.training;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	
	public List<Book>getAllBooks(){
		java.util.List<Book>bookList=new ArrayList<>();
		bookList.add(new Book(202,"life of java"));
		return bookList;
	}

}

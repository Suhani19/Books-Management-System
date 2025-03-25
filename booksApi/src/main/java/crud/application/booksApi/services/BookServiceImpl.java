package com.springcrud.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import crud.application.booksApi.dao.BookDao;
//import com.springcrud.crud.dao.BookDao;
import crud.application.booksApi.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao BookDao;

	@Override
	public List<Book> getBooks() {
		return BookDao.findAll();
	}

	@Override
	public Book getBook(long BookId) {
		return BookDao.findById(BookId).get();
	}

	@Override
	public Book addBook(Book Book) {
		BookDao.save(Book);
		return Book;
	}

	@Override
	public Book updateBook(Book Book) {
		BookDao.save(Book);
		return Book;
	}

	@Override
	public Book deleteBook(long BookId) {
		Book Book = BookDao.findById(BookId).get();
		BookDao.delete(Book);
		return Book;
	}
	
}
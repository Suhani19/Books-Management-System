package crud.application.booksApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import crud.application.booksApi.model.Book;
import crud.application.booksApi.services.bookService;



@RestController
@CrossOrigin
public class BookController {
	
	@Autowired
	private bookService BookService;

	@PostMapping("/Book")
	public Book addBook(@RequestBody Book Book) {
		return this.BookService.addBook(Book);
	}
	
	@GetMapping("/Books")
	public List<Book> getBooks() {
		return this.BookService.getBooks();
	}
	
	@GetMapping("/Books/{BookId}")
	public Book getBook(@PathVariable String BookId) {
		return this.BookService.getBook(Long.parseLong(BookId));
	}
	
	@PutMapping("/Book")
	public Book updateBook(@RequestBody Book Book) {
		return this.BookService.updateBook(Book);
	}
	
	@DeleteMapping("/Book/{BookId}")
	public Book deleteBook(@PathVariable String BookId){
		return this.BookService.deleteBook(Long.parseLong(BookId));
	}
	
}

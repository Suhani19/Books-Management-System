package crud.application.booksApi.services;

public interface bookService {
	
public List<Book> getUsers();
	
	public Book getUser(Book bookId);
	
	public Book addUser(Book book);
	
	public Book updateUser(Book book);
	
	public Book deleteUser(Book bookId);
	

}

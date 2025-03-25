package crud.application.booksApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.application.booksApi.model.Book;

public interface BookDao extends  JpaRepository<Book,Long>{
	

}

package pl.coderslab.workshop.service;

import pl.coderslab.workshop.model.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);

    Book addBook(Book bookToAdd);

    void editBook(Book bookToEdit);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}

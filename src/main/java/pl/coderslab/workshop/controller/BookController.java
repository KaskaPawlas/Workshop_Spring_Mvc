package pl.coderslab.workshop.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.workshop.model.Book;
import pl.coderslab.workshop.service.RepositoryBookService;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    RepositoryBookService bookService = new RepositoryBookService();

    public BookController(RepositoryBookService mockBookService) {
        this.bookService = mockBookService;
    }

    public RepositoryBookService getBookService() {
        return bookService;
    }

    public void setBookService(RepositoryBookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324064212", "W środku jesteśmy baśnią",
                "Wiesław Myśliwski", "Znak", "biography");

    }

    @GetMapping("")
    public List<Book> allBooks() {
        return bookService.findAllBooks();
    }

    @PutMapping("")
    public void editBook(@RequestBody Book book) {
        bookService.editBook(book);
    }

    @PostMapping("")
    public void addNewBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book showBook(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}

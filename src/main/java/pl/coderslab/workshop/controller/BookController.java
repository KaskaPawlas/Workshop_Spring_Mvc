package pl.coderslab.workshop.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.workshop.Book;
import pl.coderslab.workshop.MockBookService;

import java.util.List;


@RestController
public class BookController {

    MockBookService mockBookService = new MockBookService();

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L, "9788324064212", "W środku jesteśmy baśnią",
                "Wiesław Myśliwski", "Znak", "biography");

    }

    @GetMapping("/books")
    public List<Book> allBooks(){
        return mockBookService.allBooks();
    }

    @PutMapping("/books")
    public void editBook(Long bookId){
        mockBookService.editBook(bookId);
    }

    @PostMapping("/books")
    public void addNewBook(@RequestBody Book book){
        mockBookService.addBook(book);
    }
    @GetMapping("/books/{id}")
    public Book showBook (@PathVariable Long id){
        return mockBookService.showBookById(id);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id){
        mockBookService.deleteBook(id);
    }
}

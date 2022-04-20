package pl.coderslab.workshop;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MockBookService {

    private List<Book> list;
    private static Long nextId = 6L;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324064212", "W środku jesteśmy baśnią", "Wiesław Myśliwski", "Znak", "biography"));
        list.add(new Book(2L, "9788324079384", "Vetulani. Piękny umysł, dzikie serce", "Katarzyna Kubisiowska", "Znak", "biography"));
        list.add(new Book(2L, "9788326839122", "Pięknie jest żyć dwa razy", "Sharon Stone", "Agora", "biography"));
        list.add(new Book(3L, "9788324029938", "Długi film o miłości. Powrót na Broad Peak", "Jacek Hugo-Bader", "Znak", "reportage"));
        list.add(new Book(4L, "9788365271389", "Rzeczy, których nie wyrzuciłem", "Marcin Wicha", "Karakter", "biography"));
        list.add(new Book(5L, "9788308062241", "Król", "Szczepan Twardoch", "Wydawnictwo Literackie", "novel"));

    }

    public static Long getNextId() {
        return nextId;
    }


    public List<Book> allBooks(){
        return list;
    }

    public void addBook(Book book){
        list.add(book);
    }
    public void deleteBook(Long bookId){
        list.remove(bookId);
    }
    public void editBook(Long bookId){
        Optional<Book> optionalBook = list.stream().filter(book -> book.getId().equals(bookId)).findFirst();
        optionalBook.

    }
    public Book showBookById(Long bookId){
        List<Book> showBook = list.stream().filter(book -> book.getId().equals(bookId)).collect(Collectors.toList());
        return (Book) showBook;
    }
}

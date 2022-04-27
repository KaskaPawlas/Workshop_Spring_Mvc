package pl.coderslab.workshop.service;

import org.springframework.stereotype.Component;
import pl.coderslab.workshop.model.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class RepositoryBookService implements BookService{

    private List<Book> list;
    private static Long nextId = 6L;

    public RepositoryBookService() {
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

    @Override
    public Book getBookById(Long bookId) {
        Book bookToFind = new Book();
        for (Book book : list) {
            if (book.getId().equals(bookId)) {
                bookToFind = book;
            }
        }
        return bookToFind;
    }

    @Override
    public Book addBook(Book bookToAdd) {
        bookToAdd.setId(nextId++);
        list.add(bookToAdd);
        return bookToAdd;
    }

    @Override
    public void editBook(Book bookToEdit) {
        int editIndex = list.indexOf(bookToEdit.getId());
        list.set(editIndex, bookToEdit);
    }

    @Override
    public void deleteBook(Long bookId) {
        list.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public List<Book> findAllBooks() {
        return list;
    }



}

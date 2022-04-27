package pl.coderslab.workshop.model;

public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publishingHouse;
    private String genre;

    public Book(Long id, String isbn, String title, String author, String publishingHouse, String genre) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
    }

    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

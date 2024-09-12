public class Book {
    private String title;
    private Author author;
    private Integer year;
    private Boolean isAvailable;
    private String isbn;

    public Book(String title, Author author, Integer year, String isbn, Library library) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
        this.isbn = isbn;
        library.addBook(this);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}


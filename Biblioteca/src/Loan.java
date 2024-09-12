import java.time.LocalDate;
import java.util.Date;

public class Loan {
    private LocalDate dateCreated;
    private Date devolutionDate;
    private Book book;
    private User user;

    public Loan(Book book, User user, Library library) {
        this.dateCreated = java.time.LocalDate.now();
        this.book = book;
        this.user = user;
        book.setIsAvailable(false);
        library.addLoan(this);
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
        book.setIsAvailable(true);
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
 
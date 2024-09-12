import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<Book, Integer> books;
    private ArrayList<Loan> loans;

    public Library() {
        this.books = new HashMap<Book, Integer>();
        this.loans = new ArrayList<Loan>();
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<Book>(books.keySet());
    }

    public HashMap<Book, Integer> getBooksMap() {
        return books;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void addBook(Book book) {
        if(this.books.containsKey(book)){
            this.books.put(book, this.books.get(book) + 1);
            return;
        }

        this.books.put(book, 1);
    }

    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    public void removeBook(Book book) {
        if(this.books.containsKey(book) && this.books.get(book) > 1){
            this.books.put(book, this.books.get(book) - 1);
            return;
        }

        this.books.remove(book);
    }

    public void removeLoan(Loan loan) {
        this.loans.remove(loan);
    }
}

import java.util.Date;

public class Main {
    public static void main(String[] args) {
            User heitor = new User("Heitor", "heitorfiuzabr@gmail.com");
            Author jkRowling = new Author("JK", 1965);
            Library library = new Library();
            Book harryPotter = new Book("Harry Potter", jkRowling, 1993, "978-85-325-2929-0", library);
            Loan loan = new Loan(harryPotter, heitor, library);
            Book harryPotter2 = new Book("Harry Potter 2", jkRowling, 1995, "978-85-325-2929-1", library);
            library.addBook(harryPotter);

            System.out.println("Books in library: " + library.getBooks().size());
            System.out.println("Loans in library: " + library.getLoans().size());

            for(int i = 0; i < library.getBooks().size(); i++){
                System.out.println(
                        "Book: " + library.getBooks().get(i).getTitle() +
                                "; Quantity: " + library.getBooksMap().get(library.getBooks().get(i)));
            }

            for(int i = 0; i < library.getLoans().size(); i++){
                System.out.println("Loan: " + library.getLoans().get(i).getBook().getTitle());
            }

    }
}


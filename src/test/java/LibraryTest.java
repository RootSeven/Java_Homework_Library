import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library1;
    private Book book1;
    private Borrower borrower1;

    @Before
    public void before(){
        library1 = new Library(2 );
        book1 = new Book();
        borrower1 = new Borrower();
    }

    @Test
    public void canGetLibraryCapacity(){
        assertEquals( 2, library1.getCapacity() );
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals( 0, library1.bookCount() );
    }

    @Test
    public void canAddBookToLibrary(){
        library1.addBook(book1);
        assertEquals( 1, library1.bookCount() );
    }

    @Test
    public void cannotAddBeyondCapacity(){
        library1.addBook(book1);
        library1.addBook(book1);
        library1.addBook(book1);
        library1.addBook(book1);
        assertEquals( 2, library1.bookCount() );
    }



}



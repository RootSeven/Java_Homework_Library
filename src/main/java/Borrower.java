import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public void Borrower( String name ){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int borrowedBookCount() {
        return this.borrowedBooks.size();
    }


}

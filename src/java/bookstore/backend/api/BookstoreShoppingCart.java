package bookstore.backend.api;

import bookstore.backend.datamodel.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author hhugohm
 */
@Remote
public interface BookstoreShoppingCart {
    
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> getBooksInCart();
    void checkout();
    
}

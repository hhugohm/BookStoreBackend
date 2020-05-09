package bookstore.backend.api;

import bookstore.backend.datamodel.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author hhugohm
 */
@Remote
public interface ShoppingCartService {
    
    void add(Book book);
    void remove(Book book);
    List<Book> getItems();
    void checkout();
    
}

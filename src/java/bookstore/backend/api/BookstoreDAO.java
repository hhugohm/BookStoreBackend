package bookstore.backend.api;

import bookstore.backend.datamodel.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author hhugohm
 */
@Remote
public interface BookstoreDAO {
  
    List<Book> getAllBooks();
    List<Book> getBooksByTitle(String title);
    List<Book> getBooksByKeyword(String keyword);
    Book getBookById(int id);
    void insert(Book book);
    void update(Book book);
    void delete(Book book);
    
    
}

package bookstore.backend.api;

import bookstore.backend.datamodel.Book;
import bookstore.backend.datamodel.User;

/**
 *
 * @author hhugohm
 */
public interface UserDAO {
    
    User getUserByKey(String username,String password);
    
}

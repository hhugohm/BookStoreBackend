package bookstore.backend.api;

import bookstore.backend.datamodel.User;
import javax.ejb.Remote;

/**
 *
 * @author hhugohm
 */
@Remote
public interface UserDAO {
   
    User getUserById(int id);
    User getUserByUsernamePassword(String username,String password);
     
    
}

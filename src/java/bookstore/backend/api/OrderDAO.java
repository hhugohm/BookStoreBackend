package bookstore.backend.api;

import javax.ejb.Remote;

/**
 *
 * @author hhugohm
 */
@Remote   //DAO stalless
public interface OrderDAO {
    
    void insert();
    
}

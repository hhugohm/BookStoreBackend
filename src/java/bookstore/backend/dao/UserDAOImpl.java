package bookstore.backend.dao;

import bookstore.backend.api.UserDAO;
import bookstore.backend.datamodel.Book;
import bookstore.backend.datamodel.User;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.UserTransaction;

/**
 *
 * @author hhugohm
 */
@Stateless(name = "UserDAO")//En tiempo de Runtime ya es un EJB -->No necesita guardar el estado
@TransactionManagement(TransactionManagementType.BEAN) // uso manual de la transacional - demarcado munualmente
public class UserDAOImpl implements UserDAO {

    @PersistenceContext(name = "BookstorePU")
    private EntityManager jpa;

    @Resource
    private UserTransaction jta; //demarcacion 

    @Override
    public User getUserByKey(String username, String password) {
       TypedQuery<User> query= this.jpa.createNamedQuery("getUser", User.class);
        query.setParameter("pUsername",username ); 
        query.setParameter("pPassword",password );
        return  query.getSingleResult();
    }

}

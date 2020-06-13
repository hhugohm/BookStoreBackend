package bookstore.backend.dao;

import bookstore.backend.api.UserDAO;
import bookstore.backend.datamodel.User;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author hhugohm
 */
@Stateless(name = "UserDAO")//En tiempo de Runtime ya es un EJB -->No necesita guardar el estado
@TransactionManagement(TransactionManagementType.BEAN) // uso manual de la transacional - demarcado munualmente
public class UserDAOImpl implements UserDAO {

    @PersistenceContext(name = "BookstorePU")
    private EntityManager jpa;

    @Override
    public User getUserById(int id) {

        return this.jpa.find(User.class, id);
    }

    @Override
    public User getUserByUsernamePassword(String username, String password) {
        TypedQuery<User> query = this.jpa.createNamedQuery("getUserByUsernamePassword", User.class);
        query.setParameter("pUsername", username);
        query.setParameter("pPassword", password);
        User user=null;
        try{
        user= query.getSingleResult();
        }catch(NoResultException e){
            e.printStackTrace();;
        }
        return user;
    }

}

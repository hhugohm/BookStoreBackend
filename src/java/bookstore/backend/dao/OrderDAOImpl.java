package bookstore.backend.dao;

import bookstore.backend.api.OrderDAO;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author hhugohm
 */
@Stateless(name ="OrderDAO" )
public class OrderDAOImpl implements OrderDAO {
    
  /* @PersistenceContext(name = "BookstorePU")
    private EntityManager jpa;
   
   private SessionContext ctx;*/
     
   @TransactionAttribute(TransactionAttributeType.REQUIRED)
    //@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW) //ya trae el contexto y va a crear una nueva para hacer su actividad
    @Override
    public void insert() {
        
       /* try{
            jpa.persist(jpa);
            
        }catch(Exception e){
           ctx.setRollbackOnly();
           e.printStackTrace();;
        }
      //jpa.persist
    }*/
    }
    
}

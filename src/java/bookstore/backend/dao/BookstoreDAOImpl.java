package bookstore.backend.dao;

import bookstore.backend.api.BookstoreDAO;
import bookstore.backend.datamodel.Book;
import bookstore.backend.util.BookstoreLogger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bookstore.backend.annotations.SuppressLogging;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author hhugohm
 */
@SuppressLogging
@Stateless(name="BookstoreDAO")//En tiempo de Runtime ya es un EJB -->No necesita guardar el estado
@TransactionManagement(TransactionManagementType.BEAN) // uso manual de la transacional - demarcado munualmente
public class BookstoreDAOImpl implements BookstoreDAO{

    @PersistenceContext(name = "BookstorePU")
    private EntityManager jpa;

    @Resource
    private UserTransaction jta; //demarcacion 
    
    //private static final Logger logger= Logger.getLogger(BookstoreDAOImpl.class.getName());
    public BookstoreDAOImpl(){
        //this.jpa=this.getEntityManager();
        System.out.println("####JPA#####: "+this.jpa);
    }
    /*private EntityManager getEntityManager(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BookstorePU");
        EntityManager em = emf.createEntityManager();
        return em;
    }*/

    @SuppressLogging
    @Override
    public Book getBookById(int id) {
         Book book= this.jpa.find(Book.class, id);
         
          return book;
                  
          
         /*
         try{
             this.jta.begin();
             book= this.jpa.find(Book.class, id);
             this.jpa.lock(book, LockModeType.PESSIMISTIC_READ);
             
             try{
            System.out.println("###: Thread: " + Thread.currentThread().getName()+" working with book....");
            System.out.println("###: Thread: " + Thread.currentThread().getName()+ " finished....");
            }catch(Exception e){
                e.printStackTrace();
            }
             
             this.jta.commit();
             
            }catch(Exception e){
                e.printStackTrace();
          
            }
          return book;
            */
         
    }
    @Override
    public List<Book> getAllBooks() {
       //BookstoreLogger.log(Level.INFO,"Logging from getAllBooks() method");
        TypedQuery<Book> query= this.jpa.createNamedQuery("getAllBooks", Book.class);
        return query.getResultList();
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        TypedQuery<Book> query= this.jpa.createNamedQuery("getBooksByTitle", Book.class);
        query.setParameter("pTitle","%"+ title+"%"); //metacaracter en SQL
        return query.getResultList();
    }

    @Override
    public List<Book> getBooksByKeyword(String keyword) {
        TypedQuery<Book> query= this.jpa.createNamedQuery("getBooksByKeyword", Book.class);
        query.setParameter("pKeyword","%"+ keyword +"%"); //metacaracter en SQL
        return query.getResultList();
    }

    @Override
    public void insert(Book book) {
        try {
            //this.jpa.getTransaction().begin();
            System.out.println(book);
            System.out.println(this.jta);
            this.jta.begin();
            this.jpa.persist(book);
            this.jta.commit();
            //this.jpa.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public void update(Book book) {
        //this.jpa.getTransaction().begin();
        try{
              System.out.println(this.jta);
            this.jta.begin();
            this.jpa.merge(book);
            this.jta.commit();
             // this.jpa.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public void delete(Book book) {
       // this.jpa.getTransaction().begin();
       try{
            this.jta.begin();
            Book bookDB= this.getBookById(book.getId());
            this.jpa.remove(bookDB);
            this.jta.commit();
       // this.jpa.getTransaction().commit();
       }catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
}

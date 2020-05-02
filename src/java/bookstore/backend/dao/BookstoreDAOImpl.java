package bookstore.backend.dao;

import bookstore.backend.api.BookstoreDAO;
import bookstore.backend.datamodel.Book;
import bookstore.backend.util.BookstoreLogger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import bookstore.backend.annotations.SuppressLogging;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author hhugohm
 */
@SuppressLogging
@Stateless(name="BookstoreDAO")       //En tiempo de Runtime ya es un EJB -->No necesita guardar el estado
public class BookstoreDAOImpl implements BookstoreDAO{
    
    private EntityManager jpa;
    
    //private static final Logger logger= Logger.getLogger(BookstoreDAOImpl.class.getName());
    public BookstoreDAOImpl(){
        this.jpa=this.getEntityManager();
        System.out.println("####JPA#####: "+this.jpa);
    }
    
    
    private EntityManager getEntityManager(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BookstorePU");
        EntityManager em = emf.createEntityManager();
        return em;
    }

    
    
    @SuppressLogging
    @Override
    public Book getBookById(int id) {
         //BookstoreLogger.log(Level.FINER,"Logging from getBookById() method");
         
         Book book= this.jpa.find(Book.class, id);
         
        return book;
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
        this.jpa.getTransaction().begin();
        this.jpa.persist(book);
        this.jpa.getTransaction().commit();
        
        
    }

    @Override
    public void update(Book book) {
        this.jpa.getTransaction().begin();
        this.jpa.merge(book);
        this.jpa.getTransaction().commit();
       
    }

    @Override
    public void delete(Book book) {
        this.jpa.getTransaction().begin();
        
        this.jpa.remove(book);
        this.jpa.getTransaction().commit();
    }
    


    
    
    
}

package bookstore.backend.service;

import bookstore.backend.api.BookstoreDAO;
import bookstore.backend.datamodel.Book;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

/**
 *
 * @author hhugohm
 */
@LocalBean
@Singleton
public class SchedulingServiceImpl {
    
    private static final int STOCK_QUANTITY_THRESHOLD= 3;
    
    
    @EJB //injection
    private BookstoreDAO bookstoreDAO;
    
    //@Schedule(minute="*/3", hour="*") //cambiar sea la necesidad de cada 3 o 15 minutos
    @Schedule(minute="*/15", hour="*")
    public void logBooksBelowStockQuantityThreshold(){
        
        List<Book> books = this.bookstoreDAO.getAllBooks();
        
        List<Book> booksStock = books.stream()
                                     .filter(book ->book.getStockQuantity()<=STOCK_QUANTITY_THRESHOLD)
                                     .collect(Collectors.toList());  
        booksStock.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
    }
}


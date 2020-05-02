package bookstore.backend.service;

import bookstore.backend.api.BookstoreShoppingCart;
import bookstore.backend.datamodel.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author hhugohm
 */
@Stateful(name="BookstoreShoppingCart")    //en tiempo de runtime ya es una EJB --> Guarda el estado del carrito de compras
public class BookstoreShoppingCartImpl implements BookstoreShoppingCart{
    
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
       
    }

    @Override
    public void removeBook(Book book) {
        
    }

    @Override
    public List<Book> getBooksInCart() {
      return null;
    }

    @Override
    public void checkout() {
        
    }
    
}

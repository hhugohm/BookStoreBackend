package bookstore.backend.service;

import bookstore.backend.datamodel.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import bookstore.backend.api.ShoppingCartService;

/**
 *
 * @author hhugohm
 */
@Stateful(name="ShoppingCartIService")    //en tiempo de runtime ya es una EJB --> Guarda el estado del carrito de compras
public class ShoppingCartIServicempl implements ShoppingCartService{
    
    private List<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
       
    }

    @Override
    public void remove(Book book) {
        
    }

    @Override
    public List<Book> getItems() {
      return null;
    }

    @Override
    public void checkout() {
        
    }
    
}

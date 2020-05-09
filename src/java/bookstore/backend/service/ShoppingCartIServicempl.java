package bookstore.backend.service;

import bookstore.backend.datamodel.Book;
import java.util.List;
import javax.ejb.Stateful;
import bookstore.backend.api.ShoppingCartService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hhugohm
 */
@Stateful(name="ShoppingCartIService")    //en tiempo de runtime ya es una EJB --> Guarda el estado del carrito de compras
public class ShoppingCartIServicempl implements ShoppingCartService{
    
    private Map<Integer,Book> items = new HashMap<>();

    @Override
    public void add(Book book) {
       System.out.println("#### this: " +this);
       this.items.put(book.getId(), book);
    }

    @Override
    public void remove(Book book) {
        this.items.remove(book.getId());
    }

    @Override
    public List<Book> getItems() {
        return new ArrayList<>(this.items.values());
    }

    @Override
    public void checkout() {
        
    }
    
}

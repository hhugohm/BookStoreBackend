package bookstore.backend.service;

import bookstore.backend.datamodel.Book;
import java.util.List;
import javax.ejb.Stateful;
import bookstore.backend.api.ShoppingCartService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author hhugohm
 */
@Stateful(name="ShoppingCartIService")    //en tiempo de runtime ya es una EJB --> Guarda el estado del carrito de compras
//@TransactionManagement(TransactionManagementType.BEAN) // uso manual de la transacional - demarcado munualmente
@TransactionManagement(TransactionManagementType.CONTAINER) //opcional
public class ShoppingCartIServicempl implements ShoppingCartService{
    
    private Map<Integer,Book> items = new HashMap<>();

    @Override
    //@TransactionAttribute(TransactionAttributeType.REQUIRED)//opcional -->DEFUALT esta linea se pone en automatico en los demas metodos
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void add(Book book) {
       System.out.println("#### ShoppingCartIService: " +this);
       this.items.put(book.getId(), book);
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED) //recursos externos? y es transaccional?
    @Override
    public void remove(Book book) {
        this.items.remove(book.getId());
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED) //recursos externos? y es transaccional?
    @Override
    public List<Book> getItems() {
        return new ArrayList<>(this.items.values());
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED) //recursos externos? y es transaccional?
    //@TransactionAttribute(TransactionAttributeType.REQUIRED) //recursos externos? y es transaccional?
    @Override
    public void checkout() {
        //Ensambla la orden de compra
        //invoca al OrderDAO
        
        //solo si enl insert de la orden fue exitoso
       
        //if(! ctx.getRollbackOnly()) 
        
        //Future<String> future =####.sendOderNotificationEmail()
        
    }
    
}

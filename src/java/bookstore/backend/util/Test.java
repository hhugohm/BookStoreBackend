package bookstore.backend.util;

import bookstore.backend.api.BookstoreDAO;
import bookstore.backend.api.ShoppingCartService;
import bookstore.backend.dao.BookstoreDAOImpl;
import bookstore.backend.datamodel.Book;
import bookstore.backend.datamodel.enums.Availability;
import bookstore.backend.datamodel.enums.BookFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.naming.Context;
import javax.naming.InitialContext;


/**
 *
 * @author hhugohm
 */
public class Test {
    
    
    public static void main(String args[]){
        
        getBookById(1);
        //getAllBooks();
        //getBooksByTitle("myth");
        //getBooksByKeyword("camus");
        //insert(buildBook());
        //update(11);
        //delete(11);
       //Book book = new Book().setTitle("MI LIBRO");

        
    }
    
    private static void getBookById(int idBook){ 
        BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
        Book book=bookstoreDAO.getBookById(idBook);
        System.out.println(book.toString());
    }
    
    private static void getAllBooks(){
         BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
         List<Book> books= bookstoreDAO.getAllBooks();
         //System.out.println(books);
         //books.stream().forEach(book -> System.out.println(book.toString()));
         books.stream().forEach(System.out::println);
         
    }
    private static void getBooksByTitle(String title){ 
        BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
        List<Book> books=bookstoreDAO.getBooksByTitle(title);
        System.out.println(books.toString());
    }
    private static void getBooksByKeyword(String keyWord){
        BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
        List<Book> books=bookstoreDAO.getBooksByKeyword(keyWord);
        System.out.println(books.toString());
    }
    
    private static void insert(Book book){
         BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
        // Book book = buildBook();
         bookstoreDAO.insert(book);
    }
    private static void update(int idBook){
         BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
         Book book= bookstoreDAO.getBookById(idBook);
         book.setTitle("My Book 1 U1");
         bookstoreDAO.update(book);
    }
    private static void delete(int idBook){
         BookstoreDAO bookstoreDAO = new BookstoreDAOImpl();
         Book book= bookstoreDAO.getBookById(idBook);
         
         //boolean bandera= (Optional.ofNullable(book).isPresent())?true:false;
         
         Optional<Book> optionalBook=Optional.ofNullable(book);
         optionalBook.ifPresent(bookLamda ->{
             bookstoreDAO.delete(bookLamda);
         });
         //optionalBook.ifPresent(bookstoreDAO::delete); 
        
        /* if( Optional.ofNullable(book).isPresent()){
             bookstoreDAO.delete(book);
         }else{
               System.out.println("NO EXISTE BOOK ID= " +idBook);
         }*/
        
        
    }
    
    private static Book buildBook(){
        Book book = new Book();
         book.setTitle("My Book 1");
         book.setDescription("This is my Book 1");
         book.setAuthor("Author 1");
         book.setPublisher("Publisher 1");
         book.setPublishedDate(new Date());
         book.setLanguage("English");
         book.setNumberOfPages(111);
         book.setFormat(BookFormat.PAPERBACK);
         book.setPrice(11);
         book.setAvailability(Availability.IN_STOCK);
         book.setStockQuantity(10);
        return book;
    }
    
    
    
}

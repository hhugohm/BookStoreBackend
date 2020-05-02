package bookstore.backend.datamodel;

import bookstore.backend.datamodel.enums.Availability;
import bookstore.backend.datamodel.enums.BookFormat;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-02T16:02:01")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, byte[]> image;
    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, BookFormat> format;
    public static volatile SingularAttribute<Book, String> description;
    public static volatile SingularAttribute<Book, Integer> stockQuantity;
    public static volatile SingularAttribute<Book, String> language;
    public static volatile SingularAttribute<Book, Availability> availability;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Integer> numberOfPages;
    public static volatile SingularAttribute<Book, Double> price;
    public static volatile SingularAttribute<Book, String> publisher;
    public static volatile SingularAttribute<Book, Integer> id;
    public static volatile SingularAttribute<Book, Date> publishedDate;

}
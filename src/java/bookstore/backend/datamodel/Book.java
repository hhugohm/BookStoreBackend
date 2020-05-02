package bookstore.backend.datamodel;

import bookstore.backend.datamodel.enums.Availability;
import bookstore.backend.datamodel.enums.BookFormat;
import bookstore.backend.datamodel.enums.converters.AvailabilityConverter;
import bookstore.backend.datamodel.enums.converters.BookFormatConverter;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 *
 * @author hhugohm
 */
@Entity
@Table(name="BOOKS")
@NamedQueries({
    @NamedQuery(name="getAllBooks" ,query = "select b from Book b"),
    @NamedQuery(name="getBooksByTitle" ,query = "select b from Book b where lower(b.title) like lower(:pTitle)"),
    @NamedQuery(name="getBooksByKeyword" ,query = "select b from Book b "
            + " where lower(b.title)   like lower(:pKeyword) "
            + " or  lower(b.author)    like lower(:pKeyword) "
            + " or  lower(b.publisher) like lower(:pKeyword) ")
})
public class Book implements Serializable{
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    @Column(name="TITLE") 
    private String title;
    private String description;//--> JPA la mapea en automatico vs el filed en BD
    private String author;
    private String publisher;
    
    @Column(name="PUBLISHED_DATE")
    @Temporal(TemporalType.DATE)
    private Date publishedDate;
    
    private String language;
    
    @Column(name="NUMBER_OF_PAGES")
    private int numberOfPages;
    
    //@Transient
    @Convert(converter= BookFormatConverter.class)
    private BookFormat format;
    
    private double price;
    
    //@Transient
    @Convert(converter=AvailabilityConverter.class)
    private Availability availability;
    
    @Column(name="STOCK_QUANTITY")
    private int stockQuantity;
    
    
    private byte[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BookFormat getFormat() {
        return format;
    }

    public void setFormat(BookFormat format) {
        this.format = format;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", autho="+ author+ 
                        ", format=" +format+", availability="+availability+'}';
    }
    

    
    
}

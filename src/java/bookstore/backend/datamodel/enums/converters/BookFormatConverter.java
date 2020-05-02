
package bookstore.backend.datamodel.enums.converters;


import bookstore.backend.datamodel.enums.Availability;
import bookstore.backend.datamodel.enums.BookFormat;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author hhugohm
 */
@Converter
public class BookFormatConverter implements AttributeConverter<BookFormat, String>{
    
    private static final String P= "P";
    private static final String H= "H";
    private static final String E= "E";
    private static final String A= "A";

    @Override
    public String convertToDatabaseColumn(BookFormat bookFormat) {
        String dbData = null;

        switch (bookFormat) {
            case PAPERBACK: {
                dbData = P;
                break;
            }
            case HARDCOVER: {
                dbData = H;
                break;
            }
            case EBOOK: {
                dbData = E;
                break;
            }
            case AUDIOBOOK: {
                dbData = A;
                break;
            }
        }
        
        return dbData;
    }

    @Override
    public BookFormat convertToEntityAttribute(String dbData) {
        
        BookFormat bookFormat=null;
        
        switch (dbData) {
            case P: {
                bookFormat = BookFormat.PAPERBACK;
                break;
            }
            case H: {
                bookFormat = BookFormat.HARDCOVER;
                break;
            }
            case E: {
                bookFormat = BookFormat.EBOOK;
                break;
            }
            case A: {
                bookFormat = BookFormat.AUDIOBOOK;
                break;
            }

        }
        return bookFormat;
    }
    
}

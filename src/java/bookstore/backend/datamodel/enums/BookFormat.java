package bookstore.backend.datamodel.enums;

/**
 *
 * @author hhugohm
 */
public enum BookFormat {
    
    PAPERBACK("Paperback"), //variable new implicita
    HARDCOVER("Hardcover"),
    EBOOK("eBook"),
    AUDIOBOOK("Audio Book");
    
    private String description;
    
    private BookFormat(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return this.description;
    }
       
}

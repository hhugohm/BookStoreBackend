package bookstore.backend.datamodel.enums.converters;

import bookstore.backend.datamodel.enums.BookFormat;
import bookstore.backend.datamodel.enums.UserType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author hhugohm
 */
@Converter
public class UserTypeConverter implements AttributeConverter<UserType, String>{
    private static final String ADMINISTRATOR= "A";
    private static final String CUSTOMER= "C";

    @Override
    public String convertToDatabaseColumn(UserType userType) {
        String dbData = null;

        switch (userType) {
            case ADMIN: {
                dbData = ADMINISTRATOR;
                break;
            }
            case CUSTOMER: {
                dbData = CUSTOMER;
                break;
            }
            
        }
        
        return dbData;
    }

    @Override
    public UserType convertToEntityAttribute(String dbData) {
        
        UserType userType=null;
        
        switch (dbData) {
            case ADMINISTRATOR: {
                userType = UserType.ADMIN;
                break;
            }
            case CUSTOMER: {
                userType = UserType.CUSTOMER;
                break;
            }
            

        }
        return userType;
    }

    
}

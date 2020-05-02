package bookstore.backend.datamodel.enums.converters;

import bookstore.backend.datamodel.enums.Availability;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author hhugohm
 */
@Converter
public class AvailabilityConverter implements AttributeConverter<Availability, String> {
    
    private static final String YES="Y";
    private static final String NO="N";
    private static final String PRESALE="P";
    

    @Override
    public String convertToDatabaseColumn(Availability availability) {

        String dbData = null;

        switch (availability) {
            case IN_STOCK: {
                dbData = YES;
                break;
            }
            case PRESALE: {
                dbData = PRESALE;
                break;
            }
            case NOT_AVAILABLE: {
                dbData = NO;
                break;
            }
        }
        return dbData;

    }

    @Override
    public Availability convertToEntityAttribute(String dbData) {

        Availability availability = null;

        switch (dbData) {
            case YES: {
                availability = Availability.IN_STOCK;
                break;
            }
            case PRESALE: {
                availability = Availability.PRESALE;
                break;
            }
            case NO: {
                availability = Availability.NOT_AVAILABLE;
                break;
            }

        }
        return availability;
    }

}

package chrome.xmdl.lib.helper;

import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.ConversionException;
import chrome.xmdl.lib.dao.PersistentEnum;

/**
 * $Id: EnumerationConverter.java,v 1.3 2006/03/22 15:51:47 tr001\tr1d2643 Exp $
 * Created: 22.Mar.2006 11:33:23
 *
 * @author hd
 */
public class EnumerationConverter implements Converter {

    public EnumerationConverter() {
    }

    /**
     * Convert the specified input object into an output object of the
     * specified type.
     *
     * @param type Data type to which this value should be converted
     * @param value The input value to be converted
     *
     * @exception org.apache.commons.beanutils.ConversionException if conversion cannot be performed
     *  successfully
     */
    public Object convert(Class type, Object value) {
        if (value instanceof PersistentEnum) {
            return value;
        }
        if (value instanceof Number) {
            Number number = ((Number) value);
            int i = number.intValue();
            PersistentEnum en = PersistentEnum.get(type, i);
            return en;
        }
        if (value instanceof String) {
            String name = ((String) value);
            PersistentEnum en = PersistentEnum.get(type, name);
            if (en == null){
                //check for numeric String value
                try {
                    int i = Integer.parseInt(name);
                    en = PersistentEnum.get(type, i);
                } catch (NumberFormatException e) {
                    //nope
                }
            }
            return en;
        }
        return new ConversionException("Cannot convert object " + value + " to " + type);
    }

}

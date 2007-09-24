package chrome.xmdl.lib.ui.web.form;

import fr.improve.struts.taglib.layout.formatter.DispatchFormatter;

import javax.servlet.jsp.PageContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import chrome.xmdl.lib.helper.DateUtil;
import chrome.xmdl.lib.helper.CurrencyUtil;

/**
 * Date: 26.Oca.2006
 *
 * @author hd
 */
public class UniversalFormatter extends DispatchFormatter {
    private static final Log LOGGER = LogFactory.getLog(UniversalFormatter.class);


    protected final DecimalFormat formatter = new DecimalFormat("###,###.00");

    /**
     * If value is not null,
     * cast value in a java.util.Date object and format it
     * according to the DateFormat.SHORT pattern and the request locale.
     */
    public String date(Object value, PageContext pageContext) {
        String datePattern = DateUtil.getDatePattern();
        LOGGER.debug("datePattern = " + datePattern);

        Date val = (Date) value;
        if (val == null) {
            return null;
        } else {
            DateFormat df = new SimpleDateFormat(datePattern);
            return df.format(val);
        }
    }
    /**
     * If value is not null,
     * cast value in a java.util.Date object and format it
     * according to the DateFormat.SHORT pattern and the request locale.
     */
    public String time(Object value, PageContext pageContext) {
        String timePattern = DateUtil.getTimePattern();
        LOGGER.debug("timePattern = " + timePattern);

        Date val = (Date) value;
        if (val == null) {
            return null;
        } else {
            DateFormat df = new SimpleDateFormat(timePattern);
            return df.format(val);
        }
    }

    public String currency(Object value, PageContext pageContext) {
        return formatDouble(value, pageContext);
    }

    public String formatDouble(Object value, PageContext pageContext) {
        DecimalFormat format = CurrencyUtil.getFormat();
        Double val = (Double) value;
        if (val == null) {
            return null;
        } else {
            return format.format(val);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("tr"));
        double d = 12345678.926;
        UniversalFormatter df = new UniversalFormatter();
        String str = df.currency(d, null);
        System.out.println(str);
        System.out.println(df.time(new Date(), null));
    }
}


package chrome.xmdl.lib.ui.web.decorator;

import org.displaytag.decorator.ColumnDecorator;
import org.displaytag.exception.DecoratorException;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Date;

import chrome.xmdl.lib.helper.DateUtil;

/**
 * $Id$
 * Created: 23.Eyl.2006 18:59:43
 *
 * @author hd
 */
public class TimeDecorator implements ColumnDecorator {
    private static final Log LOGGER = LogFactory.getLog(TimeDecorator.class);

    public String decorate(Object o) throws DecoratorException {
        Date date = (Date) o;
        LOGGER.debug("date = " + date);
        String ds = DateUtil.getTimeNow(date);
        LOGGER.debug("ds = " + ds);
        return ds;
    }
}

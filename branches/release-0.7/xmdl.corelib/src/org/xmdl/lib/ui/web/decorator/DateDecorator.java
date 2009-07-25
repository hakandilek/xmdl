package org.xmdl.lib.ui.web.decorator;

import org.displaytag.decorator.ColumnDecorator;
import org.displaytag.exception.DecoratorException;
import org.xmdl.lib.helper.DateUtil;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Date;


/**
 * $Id$
 * Created: 23.Eyl.2006 18:59:43
 *
 * @author hd
 */
public class DateDecorator implements ColumnDecorator {
    private static final Log LOGGER = LogFactory.getLog(DateDecorator.class);

    public String decorate(Object o) throws DecoratorException {
        Date date = (Date) o;
        LOGGER.debug("date = " + date);
        String ds = DateUtil.getDate(date);
        LOGGER.debug("ds = " + ds);
        return ds;
    }
}

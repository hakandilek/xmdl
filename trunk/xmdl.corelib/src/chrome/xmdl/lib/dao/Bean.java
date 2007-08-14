package chrome.xmdl.lib.dao;

import java.io.Serializable;

/**
 * Just a markup interface for Beans, having no methods
 * @author hd
 */
public interface Bean extends Serializable {
    String toString();
    boolean equals(Object o);
    int hashCode();
}

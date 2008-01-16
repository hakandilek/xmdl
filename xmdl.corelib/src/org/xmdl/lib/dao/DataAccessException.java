/**
 * 
 */
package org.xmdl.lib.dao;

/**
 * @author tr1d2643
 *@author tr1d2643
 */
public class DataAccessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7857516833172872107L;

	/**
	 * 
	 */
	public DataAccessException() {
		super();
		
	}

	/**
	 * @param message
	 */
	public DataAccessException(String message) {
		super(message);
		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * @param cause
	 */
	public DataAccessException(Throwable cause) {
		super(cause);
		
	}

}

/**
 * 
 */
package org.owasp.esapi;

import org.owasp.esapi.interfaces.ILogFactory;
import org.owasp.esapi.interfaces.ILogger;

/**
 * @author rdawes
 *
 */
public class JavaLogFactory implements ILogFactory {

	private String applicationName;
	
	public JavaLogFactory(String applicationName) {
		this.applicationName = applicationName;
	}
	
	/* (non-Javadoc)
     * @see org.owasp.esapi.interfaces.ILogFactory#getLogger(java.lang.Class)
     */
    public ILogger getLogger(Class clazz) {
	    return new Logger(applicationName, clazz.getName());
    }

	/* (non-Javadoc)
     * @see org.owasp.esapi.interfaces.ILogFactory#getLogger(java.lang.String)
     */
    public ILogger getLogger(String name) {
    	return new Logger(applicationName, name);
    }

}
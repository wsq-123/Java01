
package com.offcn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* ServerService service = new ServerService();
* Server portType = service.getServerPort();
* portType.getValue(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "ServerService", targetNamespace = "http://offcn.com/", wsdlLocation = "http://localhost:9001/Service/hello?wsdl")
public class ServerService extends Service {

	private final static URL SERVERSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.offcn.ServerService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.offcn.ServerService.class.getResource(".");
			url = new URL(baseUrl, "http://localhost:9001/Service/hello?wsdl");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'http://localhost:9001/Service/hello?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		SERVERSERVICE_WSDL_LOCATION = url;
	}

	public ServerService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServerService() {
		super(SERVERSERVICE_WSDL_LOCATION, new QName("http://offcn.com/", "ServerService"));
	}

	/**
	 * 
	 * @return returns Server
	 */
	@WebEndpoint(name = "ServerPort")
	public Server getServerPort() {
		return super.getPort(new QName("http://offcn.com/", "ServerPort"), Server.class);
	}

}

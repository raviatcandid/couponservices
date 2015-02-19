package com.icoke.coupon.soap;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;
import com.icoke.webservices.beans.serviceFault.ServiceFaultDocument;


/**
 * An exception that carries a ServiceFault document for inclusion in
 * the SoapFault
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@SoapFault(faultCode = FaultCode.SERVER, faultStringOrReason="SERVICE-ERR", locale="en")
public class ServiceFaultException extends Exception {
private static final long serialVersionUID = 1L;
	private ServiceFaultDocument faultMessage;

	public ServiceFaultException() {
		super("ServiceFaultException");
	}

	public ServiceFaultException(String s) {
		super(s);
	}

	public ServiceFaultException(String s, Throwable ex) {
		super(s, ex);
	}

	public ServiceFaultException(String s, Throwable ex, ServiceFaultDocument msg) {
		super(s,ex);
		setFaultMessage(msg);

	}

	public void setFaultMessage(ServiceFaultDocument msg) {
		faultMessage = msg;
	}

	public ServiceFaultDocument getFaultMessage() {
		return faultMessage;
	}

}

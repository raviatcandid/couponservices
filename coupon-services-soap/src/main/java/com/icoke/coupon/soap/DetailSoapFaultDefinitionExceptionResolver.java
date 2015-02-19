package com.icoke.coupon.soap;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.icoke.coupon.webservices.ServiceException;
import com.icoke.webservices.beans.serviceFault.ServiceFaultDocument;
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;
import org.springframework.xml.transform.StringSource;


/**
 * This class maps normal exceptions to the xmlbean-generated fault classes
 * that will provide a SOAP fault to caller.
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class DetailSoapFaultDefinitionExceptionResolver  extends
        SoapFaultMappingExceptionResolver {

	@Override
	protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
		ServiceFaultException msg;
		if (ex instanceof ServiceFaultException) {
			msg = (ServiceFaultException) ex;
		} else {
			msg = createFaultMessage(ex);
		}
		addServiceFaultDetail(msg, fault);
	}

	private void addServiceFaultDetail(ServiceFaultException msg, SoapFault fault)
			throws TransformerFactoryConfigurationError {
		Transformer trn;
		try {
			trn = TransformerFactory.newInstance().newTransformer();
			SoapFaultDetail faultDetail = fault.addFaultDetail();
			Result result = faultDetail.getResult();
			ServiceFaultDocument doc = msg.getFaultMessage();
			if (doc == null) {
				logger.error("ServiceFaultException thrown with no serviceFaultDocument!",msg);
			} else {
				trn.transform(new StringSource(doc.toString()), result);
			}
		} catch (TransformerException e) {
			logger.error("problem with XML transform: ", e);
		}
	}

	private ServiceFaultException createFaultMessage(Exception e) {
		ServiceFaultDocument faultDocument = ServiceFaultDocument.Factory.newInstance();
		ServiceFaultDocument.ServiceFault fault = faultDocument.addNewServiceFault();
        if (e instanceof ServiceException) {
            ServiceException se = (ServiceException) e;
            fault.setErrorCode(se.getStatus().getCode());
            fault.setErrorDescription(se.getMessage());
        } else {
		    fault.setErrorCode(0);
		    fault.setErrorDescription(e.getMessage());
        }
		ServiceFaultException faultMsg = new ServiceFaultException(e.getMessage(),e,faultDocument);
		return faultMsg;
	}
}
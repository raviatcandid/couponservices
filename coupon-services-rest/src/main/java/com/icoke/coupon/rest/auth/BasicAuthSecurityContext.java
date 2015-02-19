package com.icoke.pcservices.rest.auth;

import java.security.Principal;

import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

public class BasicAuthSecurityContext implements SecurityContext {
	
	
	private Principal principal;
	
	private UriInfo uriInfo;
	
	public BasicAuthSecurityContext(final long Id, UriInfo uriInfo){
		
		this.principal=new Principal() {
			public String getName(){
				return String.valueOf(Id);
			}
		};
		this.uriInfo=uriInfo;
	}

	@Override
	public String getAuthenticationScheme() {
		return  SecurityContext.BASIC_AUTH;
	}

	@Override
	public Principal getUserPrincipal() {
		return this.principal;
	}

	@Override
	public boolean isSecure() {
		return "https".equals(uriInfo.getRequestUri().getScheme());
	}

	@Override
	public boolean isUserInRole(String arg0) {
		
		return true;
	}

}

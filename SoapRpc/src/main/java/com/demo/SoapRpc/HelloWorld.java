package com.demo.SoapRpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface HelloWorld {
	@WebMethod
	String getHelloWorld(String name);
	
	
}







package com.demo.SoapRpc;

import javax.jws.WebService;

@WebService(endpointInterface="com.demo.SoapRpc.HelloWorld")

public class HelloWorldImpl implements HelloWorld {

	public String getHelloWorld(String name) {
		return "Hello World, " +name;
		
	}
}


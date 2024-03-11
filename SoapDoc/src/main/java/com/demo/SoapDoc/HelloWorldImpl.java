package com.demo.SoapDoc;

import javax.jws.WebService;




@WebService(endpointInterface="com.demo.SoapDoc.HelloWorld")

public class HelloWorldImpl implements HelloWorld {

	public String getHelloWorld(String name) {

		return "Hello World, " +name;
	}
}


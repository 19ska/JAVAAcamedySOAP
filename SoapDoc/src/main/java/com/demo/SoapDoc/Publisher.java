package com.demo.SoapDoc;

import javax.xml.ws.Endpoint;




public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8994/ws/hello",new HelloWorldImpl());
		System.out.println("RUNNING");

	}


}

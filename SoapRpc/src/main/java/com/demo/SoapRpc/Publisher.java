package com.demo.SoapRpc;

import javax.xml.ws.Endpoint;


public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8995/ws/hello",new HelloWorldImpl());

	}


}

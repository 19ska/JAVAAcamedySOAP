package com.demo.SoapRpc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.demo.SoapRpc.HelloWorld;



public class HelloWorldClient {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://localhost:8995/ws/hello?wsdl");
		QName qname=new QName("http://SoapRpc.demo.com/","HelloWorldImplService");
		Service service=Service.create(url,qname);
		HelloWorld port=service.getPort(HelloWorld.class);
		System.out.println(port.getHelloWorld("ABC"));

	}


}

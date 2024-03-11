package com.demo.SoapDoc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.demo.SoapDoc.HelloWorld;



public class HelloWorldClient {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://localhost:8994/ws/hello?wsdl");
		QName qname=new QName("http://SoapDoc.demo.com/","HelloWorldImplService");
		Service service=Service.create(url,qname);
		HelloWorld port=service.getPort(HelloWorld.class);
		System.out.println(port.getHelloWorld("ABC"));

	}


}

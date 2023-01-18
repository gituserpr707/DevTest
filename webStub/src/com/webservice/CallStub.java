package com.webservice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class CallStub {
	public static void main(String args[]) throws MalformedURLException, RemoteException
	
	{
		java.net.URL url = new java.net.URL("http://localhost:8080/NagaraJWebService/services/Add");
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		AddSoap11BindingStub stub=new AddSoap11BindingStub(url,service);
		int c=stub.add(10,20);
		System.out.println(c);
		
	}

}

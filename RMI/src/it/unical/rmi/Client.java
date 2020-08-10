package it.unical.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		
			HelloService service = (HelloService) Naming.lookup("rmi://localhost:5099/hello");
			System.out.println(service.echo("hey Server") + "\nresponse from class: " + service.getClass().getName());
	}
}

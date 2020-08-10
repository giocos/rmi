package it.unical.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class HelloServiceImp extends UnicastRemoteObject implements HelloService {

	protected HelloServiceImp() throws RemoteException {}
	
	@Override
	public String echo(String input) throws RemoteException {
		return "From server: " + input;
	}

}

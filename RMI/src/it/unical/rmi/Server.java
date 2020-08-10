package it.unical.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws RemoteException, InterruptedException {
		
		Registry registry = LocateRegistry.createRegistry(5099);
		registry.rebind("hello", new HelloServiceImp());
	}
}

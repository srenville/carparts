/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;
//import java.net.*;
import java.net.MalformedURLException;
import java.rmi.*;

/**
 *
 * @author Toozigba
 */
public class CarPartsServer {
    
    
    
  public static void main (String args [])  {
  	try {
  	  CarPartsImpl CarPartsImpl = new CarPartsImpl();
          java.rmi.registry.LocateRegistry.createRegistry(1099);
  	  Naming.rebind("CarPartsServer", CarPartsImpl);
  	}
  	catch (MalformedURLException | RemoteException e)  {
  	System.out.println("Exception: " + e);
  	}	 
  }

    
}

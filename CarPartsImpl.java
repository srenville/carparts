/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;
   import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author Toozigba
 */
public class CarPartsImpl extends UnicastRemoteObject implements CarPartsInterface{
    
    
      public CarPartsImpl() throws RemoteException {
  	}

    
      public double add (double d1, double d2) throws RemoteException {
  	 return d1 + d2;
  }
} 
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;
import static carparts.CarPartsServer.database;
   import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Toozigba
 */
public class CarPartsImpl extends UnicastRemoteObject implements CarPartsInterface{
    
    
      public CarPartsImpl() throws RemoteException {
  	}

    
      @Override
      public double add (double d1, double d2) throws RemoteException {
  	 return d1 + d2;
  }

    
} 
 


 


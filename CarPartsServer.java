/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;
//import java.net.*;
import java.util.List;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Toozigba
 */
public class CarPartsServer {
    
   static List<PartObj> database = new ArrayList<PartObj>();
   
   
   
   public static void readFile(String filePath) throws FileNotFoundException{
       Scanner sc = new Scanner(new File(filePath));
       int count=1;
       List <String> buffer = new ArrayList <String>();
       while(sc.hasNext()){
                                String s;
                                s = sc.next();
                               // System.out.print(s+" ");
                                buffer.add(s);
                                if(count%4==0){

                                                PartObj part=new PartObj((String)buffer.get(0),Integer.parseInt(buffer.get(1).trim()),Integer.parseInt(buffer.get(2).trim()),Integer.parseInt(buffer.get(3).trim()));
                                                database.add(part);
                                                buffer.clear();
                                              }
                                count++;
                            }
       
     //  System.out.print(database.get(1).getPartName());
   } 
//   public static List<PartsPricesResultSet> viewAllPartsPrices(){
//       List<PartsPricesResultSet> PartsPricesResultSet = new ArrayList<PartsPricesResultSet>();
//      
//       
//       int i=0;
//       while(i<database.size()){
//           PartsPricesResultSet PartsPricesResult=new PartsPricesResultSet(database.get(i).getPartName(),database.get(i).getSellPrice());
//           PartsPricesResultSet.add(PartsPricesResult);
//           i++;
//       }
//       
//       return PartsPricesResultSet;
//   }
  public static void main (String args []) throws FileNotFoundException  {
  	try {
          readFile("input.dat");
  	 // CarPartsImpl CarPartsImpl = new CarPartsImpl();
          viewAllPartsPrices viewAllPartsPrices = new viewAllPartsPrices();
          getPriceImpl getPriceImpl=new getPriceImpl();
          java.rmi.registry.LocateRegistry.createRegistry(1099);
  	 // Naming.rebind("CarPartsServer", CarPartsImpl);
          Naming.rebind("CarPartsServer", viewAllPartsPrices);
          //Naming.rebind("CarPartsServer", getPriceImpl);
  	}
  	catch (MalformedURLException | RemoteException e)  {
  	System.out.println("Exception: " + e);
  	}
        
       // System.out.print(viewAllPartsPrices().get(1).getPartName());
       // System.out.print(viewAllPartsPrices().get(1).getSellPrice());
  }

    
}

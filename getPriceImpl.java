/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

import static carparts.CarPartsServer.database;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Toozigba
 */
public class getPriceImpl extends UnicastRemoteObject implements getPriceInterface {

  
    public getPriceImpl() throws RemoteException {
        
    }
    
    
    @Override
     public String getPrice(String ItemName)throws RemoteException{
       PartPricesResultSet PartPricesResultSet = new PartPricesResultSet();
      
       
       int i=0;
       while(i<database.size()){
           if(database.get(i).getPartName().equals(ItemName)){
                                PartsPricesResult PartsPricesResult=new PartsPricesResult(database.get(i).getPartName(),database.get(i).getSellPrice());

                                PartPricesResultSet.addResult(PartsPricesResult);  

           }
           
           i++;
       }
       String result="";
       i=0;
       while(i<PartPricesResultSet.getPartPricesResults().size()){
           result=result.concat(i+1+":"+PartPricesResultSet.getPartPricesResults().get(i).getPartName()+"---------------"+" "+"$"+ PartPricesResultSet.getPartPricesResults().get(i).getSellPrice()+"\n");
       i++;
       }
       PartPricesResultSet.clear();
       return result;
   }
    
}

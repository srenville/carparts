/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

import static carparts.CarPartsServer.database;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toozigba
 */

    
    
    public class viewAllPartsPrices extends UnicastRemoteObject implements viewAllPartsPricesInterface,getPriceInterface,changePrice,deletePart,generateReport{
    
    
      public viewAllPartsPrices() throws RemoteException {
  	}

    
  
      @Override
       public String viewAllPartsPrices()throws RemoteException{
       PartPricesResultSet PartPricesResultSet = new PartPricesResultSet();
      
       
       int i=0;
       while(i<database.size()){
           PartsPricesResult PartsPricesResult=new PartsPricesResult(database.get(i).getPartName(),database.get(i).getSellPrice());
           
           PartPricesResultSet.addResult(PartsPricesResult);
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
      @Override
       public String changePrice(String ItemName, int NewPrice)throws RemoteException{
       int i=0;
       while(i<database.size()){
           if(database.get(i).getPartName().equals(ItemName)){
                                
                database.get(i).setSellPrice(NewPrice);
           }
           
           i++;
       }
       
       return "Done";
   }  
       
       
      @Override
       public String deletePart(String ItemName)throws RemoteException{
       int i=0;
       while(i<database.size()){
           if(database.get(i).getPartName().equals(ItemName)){
                                
                database.remove(database.get(i));
           }
           
           i++;
       }
       
       return "Deleted";
   }  
       
       
       public String generateReport ()throws RemoteException{
       List <profitReportItem> report= new ArrayList<>();
      
       
       int i=0;
       while(i<database.size()){
           profitReportItem profitReportItem=new profitReportItem(database.get(i).getPartName(),database.get(i).getCostPrice(),database.get(i).getSellPrice(),database.get(i).getQtySold(),database.get(i).getQtySold()*database.get(i).getSellPrice());
           
           report.add(profitReportItem);
           i++;
       }
       String result="";
       i=0;
       while(i<report.size()){
           result=result.concat(i+1+":"+report.get(i).getItemName()+"---$"+ report.get(i).getCostPrice()+"---$"+report.get(i).getSellingPrice()+"---"+report.get(i).getQtySold()+ "---$"+report.get(i).getProfit()+"\n");
       i++;
       }
       report.clear();
       return result;
   }
       
       
} 
    


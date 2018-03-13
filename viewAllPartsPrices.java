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
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author Toozigba
 */

    
    
    public class viewAllPartsPrices extends UnicastRemoteObject implements viewAllPartsPricesInterface,getPriceInterface,changePrice,deletePart,generateReport,sendMail{
    
    
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
       if(PartPricesResultSet.getPartPricesResults().size()==0){
           result = "Item not found.";
       }
       
       PartPricesResultSet.clear();
       return result;
   }
      @Override
       public String changePrice(String ItemName, int NewPrice)throws RemoteException{
       int i=0;
       String result="";
       while(i<database.size()){
           if(database.get(i).getPartName().equals(ItemName)){
                                
                database.get(i).setSellPrice(NewPrice);
                result="done";
           }
           
           i++;
       }
       if(result.length()==0){
           result="Part not found";
       }
       
       return result;
   }  
       
       
      @Override
       public String deletePart(String ItemName)throws RemoteException{
       int i=0;
       String result="";
       while(i<database.size()){
           if(database.get(i).getPartName().equals(ItemName)){
                                
                database.remove(database.get(i));
                 result="done";
           }
           
           
           i++;
       }
       if(result.length()==0){
           result="Part not found";
       }
             
       return result;
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
       if(result.length()==0){
           result="Error generating report";
       }
       return result;
   }
       
       
       
       
      @Override
    public String sendMail(String EmailAddress) throws RemoteException, AddressException, MessagingException{
     String host="smtp.fastmail.com";
     String user="carparts@fastmail.com";//30 days email account, change to perminent mail account for more use
     String pass="mbb43ua9226lux3s";//get new app password for new mail account after 30 days
     String to=EmailAddress;
     String from="carparts@fastmail.com";
     String subject="Profit Repport";
     String message=this.generateReport();
     boolean  seasionDebug=false;
     
     Properties props = System.getProperties();
     
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", host);
     props.put("mail.smtp.port", "587");
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.required", "true");
     
     java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
     Session mailSession = Session.getInstance(props,null);
     Message msg = new MimeMessage(mailSession);
     msg.setFrom(new InternetAddress(from));
     InternetAddress[] address={new InternetAddress(to)};
     msg.setRecipients(Message.RecipientType.TO, address);
     msg.setSubject(subject);
     msg.setSentDate(new Date());
     msg.setText(message);
     
     Transport transport=mailSession.getTransport("smtp");
     transport.connect(host,user,pass);
     transport.sendMessage(msg, msg.getAllRecipients());
     transport.close();
     
     System.out.println("message sent");
     
        return "Message Sent";
    }   
       
} 
    


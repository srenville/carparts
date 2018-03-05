/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toozigba
 */
public class PartPricesResultSet extends UnicastRemoteObject implements Serializable{
    
    static  List<PartsPricesResult> PartPricesResults=new ArrayList<>();

    public PartPricesResultSet() throws RemoteException{
    }

    public void setPartPricesResult(List<PartsPricesResult> PartPricesResult) {
        this.PartPricesResults = PartPricesResult;
    }
    
    public static void addResult(PartsPricesResult res){
        
        PartPricesResults.add(res);
    }

    public  List<PartsPricesResult> getPartPricesResults() {
        return PartPricesResults;
    }
    
    public void clear(){
        PartPricesResults.clear();
    }
    
}

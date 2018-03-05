/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

/**
 *
 * @author Toozigba
 */
public class PartObj {
    
   private String PartName;
   private int CostPrice;
   private int SellPrice;
   private int QtySold;

    public PartObj(String PartName, int CostPrice, int SellPrice, int QtySold) {
        this.PartName = PartName;
        this.CostPrice = CostPrice;
        this.SellPrice = SellPrice;
        this.QtySold = QtySold;
    }

    public PartObj() {
    }
    

    public void setPartName(String PartName) {
        this.PartName = PartName;
    }

    public void setCostPrice(int CostPrice) {
        this.CostPrice = CostPrice;
    }

    public void setSellPrice(int SellPrice) {
        this.SellPrice = SellPrice;
    }

    public void setQtySold(int QtySold) {
        this.QtySold = QtySold;
    }

    public String getPartName() {
        return PartName;
    }

    public int getCostPrice() {
        return CostPrice;
    }

    public int getSellPrice() {
        return SellPrice;
    }

    public int getQtySold() {
        return QtySold;
    }
    
    
    
    
}

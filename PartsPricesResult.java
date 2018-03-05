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
public class PartsPricesResult {
   private String PartName;
   private int SellPrice;

    public PartsPricesResult(String PartName, int SellPrice) {
        this.PartName = PartName;
        this.SellPrice = SellPrice;
    }

    public PartsPricesResult() {
    }

    public String getPartName() {
        return PartName;
    }

    public int getSellPrice() {
        return SellPrice;
    }

    public void setPartName(String PartName) {
        this.PartName = PartName;
    }

    public void setSellPrice(int SellPrice) {
        this.SellPrice = SellPrice;
    }
    
    
    
    
}

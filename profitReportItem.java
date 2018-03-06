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
public class profitReportItem {
    
    private String ItemName;
     private int CostPrice;
    private int SellingPrice;
     private int QtySold;
  private int Profit;

    public profitReportItem() {
    }

    public profitReportItem(String ItemName, int CostPrice, int SellingPrice, int QtySold, int Profit) {
        this.ItemName = ItemName;
        this.CostPrice = CostPrice;
        this.SellingPrice = SellingPrice;
        this.QtySold = QtySold;
        this.Profit = Profit;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(int CostPrice) {
        this.CostPrice = CostPrice;
    }

    public int getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(int SellingPrice) {
        this.SellingPrice = SellingPrice;
    }

    public int getQtySold() {
        return QtySold;
    }

    public void setQtySold(int QtySold) {
        this.QtySold = QtySold;
    }

    public int getProfit() {
        return Profit;
    }

    public void setProfit(int Profit) {
        this.Profit = Profit;
    }
    
    
    
    
    
    
}

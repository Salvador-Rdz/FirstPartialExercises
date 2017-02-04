/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Salvador
 */
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    //Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice)
    {
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    //Getters
    public String getID()
    {
        return this.id;
    }
    public String getDesc()
    {
        return this.desc;
    }
    public int getQty()
    {
        return this.qty;
    }
    public double getUnitPrice()
    {
        return this.unitPrice;
    }
    //Setters
    public void setQty(int qty)
    {
        this.qty=qty;
    }
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice=unitPrice;
    }
    //Methods
    public double getTotal()
    {
        return unitPrice*qty;
    }
    @Override
    public String toString()
    {
        return "InvoiceItem[ id= "+this.id+" ,desc="+this.desc+", qty="+this.qty+", unitPrice="+this.unitPrice+" ]";
    }
}

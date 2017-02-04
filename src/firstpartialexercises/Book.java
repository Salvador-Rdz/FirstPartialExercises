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
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    //Constructors
    public Book(String name,Author[] authors,double price)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=0;
    }
    public Book(String name,Author[] authors,double price, int qty)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    //Getters
    public String getName()
    {
        return this.name;
    }
    public Author[] getAuthors()
    {
        return this.authors;
    }
    public double getPrice()
    {
        return this.price;
    } 
    public int getQty()
    {
        return this.qty;
    }
    //Setter
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQty(int qty)
    {
        this.qty=qty;
    }
    //Methods
    @Override
    public String toString()
    {
        String a="";
        for(int i=0;this.authors.length<i;i++)
        {
            a+=authors[i].toString();
        }
        return "Book[ name= "+this.name+",authors={"+a+",price= "+this.price+", qty="+this.qty;
    }
    public String getAuthorNames()
    {
        String a="";
        for(int i=0;this.authors.length<i;i++)
        {
            a+=authors[i].getName()+", ";
        }
        return "Author Names: "+a;
    }
}

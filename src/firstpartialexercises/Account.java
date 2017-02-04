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
public class Account {
    private String id;
    private String name;
    private int balance;
    //Constructors
    public Account(String id,String name)
    {
        this(id, name,0);
    }
    public Account(String id,String name, int balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    //ID, Name and Balance getters
    public String getID()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getBalance()
    {
        return this.balance;
    }
    //functions
    public int credit(int amount)
    {
        balance+=amount;
        return balance;
    }
    public int debit (int amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
        }
        else
        {
            System.err.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another,int amount)
    {
        if (amount<=balance)
        {
            another.credit(amount);
            balance-=amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString()
    {
        return "Account [ id= "+this.id+" ,name="+this.name+", balance="+this.balance+" ]";
    }
}

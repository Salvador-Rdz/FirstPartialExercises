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
public class Date {
    private int day;
    private int month;
    private int year;
    //Constructors
    public Date(int day, int month, int year)
    {
        //The constructor uses the setters to validate the values. (Messy, but works)
        setDay(day); //An alternative would be to validate them here, but it would add extra code
        setMonth(month); 
        setYear(year);
    }
    //Getters
    public int getDay()
    {
        return this.day;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getYear()
    {
        return this.year;
    }
    //Setters
    //Before setting the day/month/year, the method checks for the permited values
    public void setDay(int day)
    { 
        if(day < 1 || day > 31)
        {
            System.err.println("Day must be in between 1 and 31");
        }
        else
        {
            this.day = day;
        }
    }
    public void setMonth(int month)
    {
        if(month < 1 || month > 12)
        {
            System.err.println("Month must be in between 1 and 12");
        }
        else
        {
            this.month = month;
        }
    }
    public void setYear(int year)
    {
        if(year < 1900 || year > 9999)
        {
            System.err.println("Year must be in between 1900 and 9999");
        }
        else
        {
            this.year = year;
        }
    }
    //Methods
    public void setDate(int day, int month, int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    @Override
    public String toString()
    {
        return String.format("%02d",this.day)+"/"+String.format("%02d",this.month)+"/"+String.format("%04d",this.year);
    }
}

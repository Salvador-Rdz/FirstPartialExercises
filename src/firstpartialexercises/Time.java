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
public class Time {
    private int hour;
    private int minute;
    private int second;
    //Constructor
    public Time(int hour, int minute, int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //Getter
    public int getHour()
    {
        return this.hour;
    }
    public int getMinute()
    {
        return this.minute;
    }
    public int getSecond()
    {
        return this.second;
    }
    //Setters
    public void setHour(int hour)
    {
        this.hour=hour;
    }
    public void setMinute(int minute)
    {
        this.minute=minute;
    }
    public void setSecond(int second)
    {
        this.second=second;
    }
    public void setTime(int hour, int minute, int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //Methods
    @Override
    public String toString()
    {
        return String.format("%02d",this.hour)+":"+String.format("%02d",this.minute)+":"+String.format("%02d",this.second);
    }
    public Time nextSecond() //Adds a second, then checks for the "limit" of the time format.
    {
        this.second++;
        if(this.second==60)
        {
            this.second=0;
            this.minute++;
        }
        if(this.minute==60)
        {
            this.minute=0;
            this.hour++;
        }
        if(this.hour==24)
        {
            this.hour=0;
            System.out.println("New day!");
        }
        return this;
    }
    public Time previousSecond() //Substracts a second, then checks for the "limit" of the time format.
    {
        this.second--;
        if(this.second==-1)
        {
            this.second=59;
            this.minute--;
        }
        if(this.minute==-1)
        {
            this.minute=59;
            this.hour--;
        }
        if(this.hour==-1)
        {
            this.hour=23;
        }
        return this;
    }
}

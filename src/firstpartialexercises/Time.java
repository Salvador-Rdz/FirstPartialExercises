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
    
    public Time(int hour, int minute, int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
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
    public void setHour(int hour)
    {
        switch (hour)
        {
            case 24:
                System.out.println("New day!");
                this.hour=0;
                break;
            case -1:
                this.hour=23;
                break;
            default:
                this.hour=hour;
                break;
        }
    }
    public void setMinute(int minute)
    {
        switch (minute)
        {
            case 60:
                this.setHour(this.getHour()+1);
                this.minute=0;
                break;
            case -1:
                this.setHour(this.getHour()-1);
                this.minute=59;
                break;
            default:
                this.minute=minute;
                break;
        }
    }
    public void setSecond(int second)
    {
        switch (second)
        {
            case 60:
                this.setMinute(this.getMinute()+1);
                this.second=0;
                break;
            case -1:
                this.setMinute(this.getMinute()-1);
                this.second=59;
                break;
            default:
                this.second=second;
                break;
        }
    }
    public void setTime(int hour, int minute, int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    @Override
    public String toString()
    {
        return String.format("%02d",this.hour)+":"+String.format("%02d",this.minute)+":"+String.format("%02d",this.second);
    }
    public Time nextSecond()
    {
        this.setSecond(this.second+1);
        return this;
    }
    public Time previousSecond()
    {
        this.setSecond(this.getSecond()-1);
        return this;
    }
}

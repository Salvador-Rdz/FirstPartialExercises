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
public class MyPoint{
    private int x;
    private int y;
    //Constructors
    public MyPoint()
    {
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    //Getters
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public int[] getXY()
    {
        int[] XY={this.x,this.y}; 
        return XY;
    }
    //Setters
    public void setXY (int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    //Methods
    @Override
    public String toString()
    {
        return "("+this.x+","+this.y+")";
    }
    public double distance(int x, int y) //Uses the "Distance between to points" formula
    {
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)); //Square root of [(X2-X1)^2 +(Y2-Y1)^2]
    }
    public double distance(MyPoint another)
    {
        return Math.sqrt(Math.pow(another.getX()-this.x,2)+Math.pow(another.getY()-this.y, 2));
    }
    public double distance()
    {
        return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y,2));
    }
    
}

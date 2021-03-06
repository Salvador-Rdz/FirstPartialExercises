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
public class Rectangle {
    private float length;
    private float width;
    //Constructors
    public Rectangle()
    {
        length=1.0f;
        width=1.0f;
    }
    public Rectangle(float length, float width)
    {
        this.length=length;
        this.width=width;
    }
    //Getters
    public float getLength()
    {
        return this.length;
    }
    public float getWidth()
    {
        return this.width;
    }
    //Setters
    public void setWidth(float width)
    {
        this.width=width;
    }
    public void setLength(float length)
    {
        this.length=length;
    }
    //Methods
    public double getArea()
    {
        double a=width*length;
        return a;
    }
    public double getPerimeter()
    {
        double p=(width*2)+(length*2);
        return p;
    }
    @Override
    public String toString()
    {
        return "Rectangle[ length= "+this.length+" ,width="+this.width+" ]";
    }
}

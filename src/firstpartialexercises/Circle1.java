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
public class Circle1 {
    private double radius;
    private String color;
    //Constructors;
    public Circle1()
    {
        radius=1.0;
        color="rojo";
    }
    public Circle1(double radius)
    {
        this.radius=radius;
        color="red";
    }
    public Circle1(double radius, String color)
    {
        this.radius=radius;
        this.color=color;
    }
    //Getters
    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    //Setters
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    //Methods
    @Override
    public String toString()
    {
        return "Circle[ radius= "+this.radius+" ,color="+this.color+" ]";
    }
}

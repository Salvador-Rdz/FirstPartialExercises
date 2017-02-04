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
public class Circle {
    private double radius;
    //Constructors
    public Circle()
    {
        radius=1.0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    //Getters
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        double a = Math.PI*this.radius*this.radius;
        return a;
    }
    public double getCircumference()
    {
        double c = Math.PI*this.radius*2;
        return c;
    }
    //Setters
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    //Methods
    @Override
    public String toString()
    {
        return "Circle[ radius= "+this.radius+" ]";
    }
}

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
public class  MyCircle
{
    private MyPoint center = new MyPoint();
    private int radius;
    //Constructors
    public MyCircle()
    {
        this.center.setXY(0, 0);
        this.radius=1;
    }
    public MyCircle(int x, int y, int radius)
    {
        this.center.setX(x);
        this.center.setY(y);
        this.radius=radius;
    }

    public MyCircle(MyPoint center, int radius) 
    {
        this.center = center;
        this.radius = radius;
    }
    //Getters
    public int getRadius() 
    {
        return radius;
    }
    public MyPoint getCenter() 
    {
        return center;
    }
    public int getCenterX()
    {
        return this.center.getX();
    }
    public int getCenterY()
    {
        return this.center.getY();
    }
    public int[] getCenterXY()
    {
        return this.center.getXY();
    }
    //Setters
    public void setRadius(int radius) 
    {
        this.radius = radius;
    }
    public void setCenter(MyPoint center) 
    {
        this.center = center;
    }
    public void setCenterX(int x)
    {
        this.center.setX(x);
    }
    public void setCenterY(int y)
    {
        this.center.setX(y);
    }
    public void setCenterXY(int x, int y)
    {
        this.center.setXY(x,y);
    }
    //Methods
    @Override
    public String toString()
    {
        return "MyCircle[radius="+this.radius+", center="+this.center.toString()+"]";
    }
    public double getArea()
    {
        return (Math.PI*this.radius*this.radius);
    }
    public double getCircumference()
    {
        return (Math.PI*2*this.radius);
    }
    public double distance (MyCircle another)
    {
        return this.center.distance(another.getCenterX(),another.getCenterY());
    }
}

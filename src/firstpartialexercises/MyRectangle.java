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
public class MyRectangle {
    private MyPoint c1 = new MyPoint();
    private MyPoint c2 = new MyPoint();
    //Constructors
    public MyRectangle()
    {
        this.c1.setXY(0,0);
        this.c2.setXY(0,0);
    }
    public MyRectangle(MyPoint c1, MyPoint c2)
    {
        this.c1=c1;
        this.c2=c2;
    }
    public MyRectangle(int x1, int y1, int x2, int y2)
    {
        this.c1.setXY(x1, y1);
        this.c2.setXY(x2, y2);
    }
    //Getters
    public MyPoint[] getCorners()
    {
        MyPoint[] corners ={this.c1,this.c2};
        return corners;
    }
    //Setters
    public void setCorners(MyPoint c1, MyPoint c2)
    {
        this.c1=c1;
        this.c2=c2;
    }
    public void setCorners(int x1, int y1, int x2, int y2)
    {
        this.c1.setXY(x1, y1);
        this.c2.setXY(x2, y2);
    }
    //Methods
    public double getPerimeter()
    {
        int a=c1.getX()-c2.getX();//Gets the distance between corners
        int b=c1.getY()-c2.getY();
        return Math.abs((a*2)*(b*2)); //Then multiplies the sides for 2 and then for each other, getting them as absolutes
    }
    public double getArea() //Gets the absolute value of the distance between corners, then multiplies them.
    {
        return Math.abs(c1.getX()-c2.getX())*(c1.getY()-c2.getY());
    }
    @Override
    public String toString()
    {
        return "MyRectangle [c1="+c1.toString()+", c2="+c2.toString()+"]";
    }
}

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
    public double getPerimeter()
    {
        int a=c1.getX()-c2.getX();
        int b=c1.getY()-c2.getY();
        return Math.abs((a*2)*(b*2));
    }
    public double getArea()
    {
        return Math.abs(c1.getX()-c2.getX())*(c1.getY()-c2.getY());
    }
    @Override
    public String toString()
    {
        return "MyRectangle [c1="+c1.toString()+", c2="+c2.toString()+"]";
    }
}

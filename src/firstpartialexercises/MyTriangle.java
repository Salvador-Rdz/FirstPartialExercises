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
public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3)
    {
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    @Override
    public String toString()
    {
        return "MyTriangle[v1="+v1.toString()+",v2="+v2.toString()+",v3="+v3.toString()+"]";
    }
    public double getPerimeter()
    {
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }
    public String getType()
    {
        double a=v1.distance(v2);//Gets the sides
        double b=v1.distance(v3);
        double c=v2.distance(v3);
        if(a==b && a==c && c==b) //If they're all equal, then its an equilateral.
        {
            return "Equilateral";
        }
        else
        {
            if(a!=b && a!=c && c!=b) //If they're all different, then its a scalene.
            {
                return "Scalene";
            }
            else                    //If it doesn't meet any of the other conditions, then its an isosceles.
            {
                return "Isosceles";
            }
        }
    }
}

import java.util.*;
class program4
{
	public static void main(String args[])
	{ 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       double r = obj.nextDouble();
       
       System.out.println("Enter length and breadth of rectangle :");
       double l = obj.nextDouble();
       double b = obj.nextDouble();
       
       System.out.println("Enter base and height of triangle :");
       float ba = obj.nextFloat();
       float h = obj.nextFloat();
       
       shapes obj1 = new shapes();
       obj1.area(r);
       obj1.area(l,b);
       obj1.area(ba,h);
    }
}

class shapes
{
    void area(double rad)
    {
        double Area = 3.14*rad*rad;
        System.out.println("Area of circle = "+Area);
    }
    
    void area(double len,double br)
    {
        double Area = len*br;
        System.out.println("Area of rectangle = "+Area);
    }
    
    void area(float base,float hei)
    {
        double Area = (hei*base)/2;
        System.out.println("Area of triangle = "+Area);
    }
}

import java.util.*;
class program5
{
	public static void main(String args[])
	{ 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       double r = obj.nextDouble();
       
       System.out.print("Enter length and breadth of rectangle :");
       double l = obj.nextDouble();
       double b = obj.nextDouble();
       
       perimeter obj1 = new perimeter(r);
       obj1 = new perimeter(l,b);
    }
}

class perimeter
{
    perimeter(double rad)
    {
        double Perimeter = 3.14*2*rad;
        System.out.println("Perimeter of circle = "+Perimeter);
    }
    
    perimeter(double len,double br)
    {
        double Perimeter = 2*(len+br);
        System.out.println("Perimeter of rectangle = "+Perimeter);
    }
    
}

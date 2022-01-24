import java.util.*;
class program5
{
	public static void main(String args[])
	{ 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       int r = obj.nextInt();
       
       System.out.print("Enter length and breadth of rectangle :");
       int l = obj.nextInt();
       int b = obj.nextInt();
       
       perimeter obj1 = new perimeter(r);
       obj1 = new perimeter(l,b);
    }
}

class perimeter
{
    perimeter(int rad)
    {
        double Perimeter = 3.14*2*rad;
        System.out.println("Perimeter of circle = "+Perimeter);
    }
    
    perimeter(int len,int br)
    {
        double Perimeter = 2*(len+br);
        System.out.println("Perimeter of rectangle = "+Perimeter);
    }
    
}

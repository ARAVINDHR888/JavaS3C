import java.util.*;
class factorial
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int n,i,fact=1;
     System.out.println("Enter the number");
     n=obj.nextInt();
     for(i=1;i<=n;i++)
      {
        fact*=i;
      }
     System.out.println("Fatorial of "+n+" is: "+fact);
    
   }
}

import java.util.*;
class oddeven
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n;
      System.out.println("Enter the number");
      n=obj.nextInt();
      if(n%2==0)
      System.out.println(n+" is an even number");
      else 
      System.out.println(n+" is an odd number");
    }
}

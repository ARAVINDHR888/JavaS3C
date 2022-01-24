import java.util.*;
class prime
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n,m,i,flag=0;
      System.out.println("Enter the number");
      n=obj.nextInt();
      m=n/2;
      for(i=2;i<=m;i++)
       {
         if(n%i==0)
          {
            flag=1;
            break;
          }
      }
      if(n==0||n==1)
      System.out.println(n+" is neither prime nor composite");
      else 
       {
        if(flag==0)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
       }
    }
}

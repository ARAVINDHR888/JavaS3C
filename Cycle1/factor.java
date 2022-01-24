import java.util.*;
class factor
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n,i;
      System.out.println("Enter the number");
      n=obj.nextInt();
      System.out.println("Factors of "+n+" are: ");
      for(i=1;i<=n;i++)
       {
        if(n%i==0)
        System.out.println(i);
       }
    }
}

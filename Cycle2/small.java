import java.util.*;
class small
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int min,i,n;
     System.out.println("Enter the number of elements");
     n=obj.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements");
     for(i=0;i<n;i++)
       a[i]=obj.nextInt();
     min=a[0];
     for(i=1;i<n;i++)
      {
          if(a[i]<min)
           min=a[i];
      }
     System.out.println("Minimum is "+min);
    }
}

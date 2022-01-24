import java.util.*;
class sumarray
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int i,n,s=0;
     System.out.println("Enter the number of elements");
     n=obj.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements");
     for(i=0;i<n;i++)
       a[i]=obj.nextInt();
     for(i=0;i<n;i++)
       s+=a[i];
     System.out.println("Sum = "+s);
    }
}

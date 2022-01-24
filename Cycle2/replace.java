import java.util.*;
class replace
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int n,i,key,element;
     System.out.println("Enter the number of elements");
     n=obj.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements");
     for(i=0;i<n;i++)
       a[i]=obj.nextInt();
     System.out.println("Enter element to be replaced");
      key=obj.nextInt();
     System.out.println("Enter new element");
      element=obj.nextInt();
     for(i=0;i<n;i++)
      {
          if(a[i]==key)
           a[i]=element;
      }
     System.out.println("New List");
     for(i=0;i<n;i++)
     System.out.println(a[i]);
    }
}

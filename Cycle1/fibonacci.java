import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int n,i,f=0,s=1,nxt;
     System.out.println("Enter an integer");
     n=obj.nextInt();
     System.out.println("Fibonacci Series ");
     for(i=1;i<=n;i++)
      {
        System.out.println(f);
        nxt=f+s;
        f=s;
        s=nxt;
      }
    }
}

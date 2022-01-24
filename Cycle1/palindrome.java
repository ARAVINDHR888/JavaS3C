import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int n,n1,d,r=0;
     System.out.println("Enter the number");
     n=obj.nextInt();
     n1=n;
     while(n!=0)
      {
        d=n%10;
        r=r*10+d;
        n/=10;
      }
     if(n1==r)
     System.out.println(n1+" is a palindrome  number");
     else 
     System.out.println(n1+" is not a palindrome number");
   }
}

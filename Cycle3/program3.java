import java.util.*;
class program3
{
	public static void main(String args[])
	{ 
	   int i;
       Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the string");
       String str=obj.nextLine();
       int len=str.length();
       char a[]=new char[len];
       for(i=0;i<len;i++)
        a[i]=str.charAt(i);
	   Strings obj1 = new Strings();
	   obj1.frequency(a,len);
	   obj1.reverse(a,len);
	}
}
	    
	    
class Strings
{
    void frequency(char a[],int n)
     {
        int i,c=0;
	    Scanner obj2 = new Scanner(System.in);
	    System.out.print("Enter a charcter whose frequency is to be found :");
	    char y = obj2.next().charAt(0);
	    
	    for(i=0;i<n;i++)
	         if(a[i] == y)
	             c = c + 1;
	    System.out.println("Frequency of entered character is "+c);
     }

    void reverse(char a[],int n)
    {
        char b[] = new char[20];
        int i,m=n-1;
        for(i=0;i<n;i++,m--)
        {
            b[i] = a[m];
        }
        
        System.out.println("Reversed String: ");
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]);
        }
    }
}

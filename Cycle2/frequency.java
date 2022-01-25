import java.util.*;
class frequency
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,flag=0,len,c=0;
        System.out.println("Enter the string");
        String str=obj.nextLine();
        len=str.length();
        char a[]=new char[len];
        for(i=0;i<len;i++)
        a[i]=str.charAt(i);
        System.out.println("Enter the character whose frequency is to be calculated");
        char ch=obj.next().charAt(0);
        for(i=0;i<len;i++)
        if(a[i]==ch)
          c=c+1;
        System.out.println("Frequency of "+ch+" = "+c);
     }
}


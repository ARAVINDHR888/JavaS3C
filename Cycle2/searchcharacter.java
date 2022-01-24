import java.util.*;
class  searchcharacter
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,flag=0,len;
        System.out.println("Enter the string");
       String str=obj.nextLine();
        len=str.length();
        char a[]=new char[len];
        for(i=0;i<len;i++)
     a[i]=str.charAt(i);
        System.out.println("Enter the character to search");
        char ch=obj.next().charAt(0);
        for(i=0;i<len;i++)
        {
            if(a[i]==ch)
            {
                flag=0;
                break;
            }
            else
            flag=1;
        }
        if(flag==1)
        System.out.println("character is not present");
        else
        System.out.println("Character is present at "+(i+1));
    }
}



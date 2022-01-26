import java.util.*;
class armstrong
{
    public static void main(String agrs[])
    {
        int count = 0, n, orgnum, i,r,revnum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        n= obj.nextInt();
        orgnum=n;
        while(n!=0)
        {
            n=n/10;
            count=count+1;
        }
        n= orgnum;
        while(n!=0)
        {
            int multi =1;
            r = n%10;
            for(i=0;i<count;i++)
            {
                multi=multi*r;
            }
            n=n/10;
            revnum=revnum+multi ;
        }
        if(orgnum==revnum)
             System.out.println("The given number is an armstrong number");
        else
             System.out.println("The given number is not an armstrong number");
    }
}

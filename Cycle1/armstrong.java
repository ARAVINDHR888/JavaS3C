import java.util.*;
class armstrong
{
    public static void main(String  args[])
    {
        Scanner obj=new Scanner(System.in);
        int count=0,n,d,D=0,n1,i;
        System.out.println("Enter a number");
        n=obj.nextInt();
        n1=n;
        while(n>0)
        {
            n=n/10;
            count=count+1;
        }
        n=n1;
        while(n>0)
        {
            int multi=1;
            d=n%10;
            for(i=0;i<count;i++)
            {
                multi=multi*d;
            }
            n=n/10;
            D=D+multi;
        }
        if(n1==D)
        System.out.println("This is an Armstrong number");
        else
        System.out.println("This is not an Armstrong number");
    }
}

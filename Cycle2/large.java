import java.util.*;
class large
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int i,j,r,c,large;
     System.out.println("Enter the number of rows and columns");
     r=obj.nextInt();
     c=obj.nextInt();
     int a[][]=new int[r][c];
     System.out.println("Enter the elements");
     for(i=0;i<r;i++)
     for(j=0;j<c;j++)
       a[i][j]=obj.nextInt();
     large=a[0][0];
     for(i=0;i<r;i++)
      {
          for(j=0;j<c;j++)
          {
            if(large<a[i][j])
            large=a[i][j];
          }
       }
     System.out.println("Largest element is "+large);
    }
}

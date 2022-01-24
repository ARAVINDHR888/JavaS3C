import java.util.*;
class addmatrix
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int i,j,r,c;
     System.out.println("Enter the number of rows and columns");
     r=obj.nextInt();
     c=obj.nextInt();
     int a[][]=new int[r][c];
     int b[][]=new int[r][c];
     int s[][]=new int[r][c];
     System.out.println("Enter the elements of 1st matrix");
     for(i=0;i<r;i++)
     for(j=0;j<c;j++)
       a[i][j]=obj.nextInt();
     System.out.println("Enter the elements of 2nd matrix");
     for(i=0;i<r;i++)
      for(j=0;j<c;j++)
         b[i][j]=obj.nextInt(); 
      for(i=0;i<r;i++)
       for(j=0;j<c;j++)
          s[i][j]=a[i][j]+b[i][j]; 
     System.out.println("Final Matrix");
     for(i=0;i<r;i++)
     {
       for(j=0;j<c;j++)
       {
         System.out.print(s[i][j]+ " ");
       }
         System.out.println();
     }
    }  
}

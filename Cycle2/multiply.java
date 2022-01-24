import java.util.*;
class mutiply
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int r1,r2,c1,c2,i,j,k;
     System.out.println("Enter the number of rows and columns of matrix 1");
     r1=obj.nextInt();
     c1=obj.nextInt();
     System.out.println("Enter the number of rows and columns of matrix 2");
     r2=obj.nextInt();
     c2=obj.nextInt();
     if(c1==r2)
     {
      int a[][]=new int[r1][c1];
      int b[][]=new int[r2][c2];
      int p[][]=new int[r1][c2];
      System.out.println("Enter the elements of 1st matrix");
      for(i=0;i<r1;i++)
      for(j=0;j<c1;j++)
       a[i][j]=obj.nextInt();
       System.out.println("Enter the elements of 2nd matrix");
       for(i=0;i<r2;i++)
       for(j=0;j<c2;j++)
         b[i][j]=obj.nextInt(); 
         for(i=0;i<r1;i++)
         for(j=0;j<c2;j++)
         {
             for(k=0;k<r2;k++)
             {
               p[i][j]+=a[i][k]*b[k][j]; 
             }
         }
      System.out.println("Output Matrix");
      for(i=0;i<r1;i++)
      {
       for(j=0;j<c2;j++)
       {
         System.out.print(p[i][j]+ " ");
       }
         System.out.println();
      } 
    }
     else 
    System.out.println("Multiplication doesnot exist");
    }  
 }

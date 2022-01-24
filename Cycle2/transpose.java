import java.util.*;
class transpose
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     int i,j,r,c;
     System.out.println("Enter the number of rows and columns");
     r=obj.nextInt();
     c=obj.nextInt();
     int original[][]=new int[r][c];
     int transpose[][]=new int[r][c];
     System.out.println("Enter the elements of matrix");
     for(i=0;i<r;i++)
     for(j=0;j<c;j++)
       original[i][j]=obj.nextInt(); 
         for(i=0;i<r;i++)
         {
         for(j=0;j<c;j++)
         {
           transpose[i][j]=original[j][i];
         }
        } 
     System.out.println("Matrix before");
     for(i=0;i<r;i++)
     {
       for(j=0;j<c;j++)
       {
         System.out.print(original[i][j]+ " ");
       }
         System.out.println();
    }
    System.out.println("Matrix after");
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print(transpose[i][j]+ " ");
      }
        System.out.println();
     }
   }  
}  

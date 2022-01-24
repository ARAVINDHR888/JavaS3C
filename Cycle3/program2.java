import java.util.*;
class program2
{
	public static void main(String args[])
	{ 
	  int num1,num2;
	  Scanner obj = new Scanner(System.in);
	  System.out.print("Enter the number whose factorial to be calculated : ");
	  num1 = obj.nextInt();
	  System.out.print("Enter the number whose sum of digits to be calculated :");
	  num2 = obj.nextInt();
	  
	  program2 obj1= new program2();
	  obj1.Factorial(num1);
	  obj1.SumofDigits(num2);  
	 }
	 
	 void Factorial(int a)
	 {
	     int i,fact=1;
	     for (i=1;i<=a;i++)
	        fact = fact * i;
	     System.out.println("Factorial = "+fact);
	 }
	    
	 void SumofDigits(int a)   
	 {
	     int res =0,rem;
	     while(a!=0)
	     {
	         rem = a%10;
	         res = res + rem;
	         a = a/10;
	     }
	 
	     System.out.println("No of digits = "+res);
	 }
}

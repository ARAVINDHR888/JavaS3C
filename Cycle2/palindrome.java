import java.util.*;   
class palindrome
{  
   public static void main(String args[])  
   {  
      String original, reverse = "";  
      int length,i;
      Scanner obj = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome");  
      original = obj.nextLine();   
      length = original.length();   
      for ( i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string is not a palindrome.");   
   }  
}  


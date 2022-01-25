import java.util.*;
public class employee 
{
    String name ;
    int empno;
    long pn;
    void EnterDetails()  
      {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name :");
        name = obj.nextLine();  
       
        System.out.print("Enter Empo No :"); 
        empno = obj.nextInt();
        
        System.out.print("Enter Phone no :"); 
        pn = obj.nextLong();
      }
       
    void PrintDetails()
      {
        
        System.out.println("Name : "+name);
        
        System.out.println("Empo No : "+empno); 

        System.out.println("Phone no : "+pn); 
      }

    public static void main(String[] args) 
      {
        int i;  
        employee obj[] = new employee[50];

        for(i=0;i<5;i++) 
          {  
            obj[i] = new employee();
            obj[i].EnterDetails(); 
          }
          System.out.println("Details");
          for(i=0;i<5;i++) 
          {
            obj[i].PrintDetails();
          }
       }
}



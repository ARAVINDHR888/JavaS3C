import java.util.*;
class program1
{
	public static void main(String args[])
	{  
		Student obj1 = new Student();
		obj1.read_details();
		obj1.print_details();
	}
}

class Student
{
    int i,r;
    String name;
    int sub[] = new int[5];
    void read_details()
    {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name :");
        name = obj.nextLine();  

        System.out.print("Enter Roll no :");
        r = obj.nextInt();
        
        
        for(i=0;i<5;i++)
             {
               System.out.print("Enter mark of subject"+(i+1)+ "= ");
               sub[i] = obj.nextInt();
             }
    }

    void print_details()
    {
        System.out.println("\n");
        System.out.println("Name : "+name);
        
        System.out.println("Roll no : "+r);
        
        for(i=0;i<5;i++)
             {
               System.out.println("Mark of subject "+(i+1)+ " = "+sub[i]);
             }
    }
}

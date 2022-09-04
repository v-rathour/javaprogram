import java.util.Scanner;
public class Collage
{
    public static void main(String args[])
    {
       Student obj=new Student();
       obj.student1();
       System.out.println("The name of the student is "+obj.name+".");
       System.out.println("The roll number is "+obj.roll_no+".");
    }
}
class Student
{
    int roll_no;
    String name;
    void student1()
    {
       Scanner obj1=new Scanner(System.in);
       System.out.print("Enter the student name:");
       name=obj1.nextLine();
       System.out.print("Enter the roll number:");
        roll_no=obj1.nextInt();
    }
}

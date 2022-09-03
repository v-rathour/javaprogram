import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        int roll_no;
        String collage_name;
        String student;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the collage name:");
        collage_name=obj.nextLine();
        System.out.println("Collage name ="+collage_name);
        System.out.print("Enter the roll number:");
        roll_no=obj.nextInt();
        System.out.println("Roll number="+roll_no);
        System.out.print("Enter the student name:");
        student=obj.next();
        System.out.print("Student name="+student);
    }
}

import java.util.Scanner;
public class company
{
    public static void main(String args[])
    {
        int roll_no;
        String str;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the name:");
        str= obj.nextLine();
        System.out.println("Name="+str);
        System.out.print("Enter the your roll number:");
        roll_no=obj.nextInt();
        System.out.println("Your roll number ="+roll_no);

    }
}

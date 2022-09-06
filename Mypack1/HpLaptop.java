package mypack1;
import mypack1.*;
import java.util.Scanner;

public class HpLaptop
{
    LaptopClass obj1=new LaptopClass();
    String company_name;
   public  void disp()
    {
        Scanner obj=new Scanner(System.in);
        obj1.input();
        System.out.print("Enter the company name:");
        company_name=obj.nextLine();
        System.out.println("company name="+company_name);
        obj1.display();
    }
}

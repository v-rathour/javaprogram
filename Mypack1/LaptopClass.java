package mypack1;

import java.util.Scanner;

public class LaptopClass
{
    public int ganrasion,price;
    public String version;
     public void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the version of the laptop:");
        version=obj.nextLine();
        System.out.print("Enter the genrasion of the Laptop:");
        ganrasion=obj.nextInt();
        System.out.println("Enter the price of the Laptop:");
        price= obj.nextInt();
    }
    public void display()
    {
        System.out.println("Genration: "+ganrasion);
        System.out.println("version: "+version);
        System.out.println("Price="+price);
    }

}

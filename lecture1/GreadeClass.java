package Lec1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreadeClass {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num;
        num=obj.nextInt();
        if(num>=75)
            System.out.println("A");
        else if(num<75 && num>=65)
            System.out.println("B");
        else if (num<65&&num>=55)
            System.out.println("C");
        else if (num<55&&num>=45)
            System.out.println("Pass");
        else  {
            System.out.println("Fail");
        }
    }
}

package Lec1;
import java.util.Scanner;

public class Odd_Even {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b&&a>c)
                System.out.println("a is greater than b and c.");
        else if(b>c)
            System.out.println("b is greater then a and c.");
        else
            System.out.println("c is greater then a and b.");
    }
}

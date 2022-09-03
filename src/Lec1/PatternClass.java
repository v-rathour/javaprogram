package Lec1;

import java.util.Scanner;

public class PatternClass {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of the row: ");
        n=obj.nextInt();
        int row=0,start;
        start=n;
        while(row<n)
        {
            int i=0;
            while(i<start){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

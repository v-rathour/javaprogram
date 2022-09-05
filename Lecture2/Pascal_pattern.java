package Lec2;

import java.util.Scanner;

public class Pascal_pattern {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of the row: ");
        n=obj.nextInt();
        int row=0;
        int start=1;
        while(row<n)
        {
            int i=0;
            int val=1;
            while(i<=row){
                System.out.print(val+" ");
                val=((row-i)*val)/(i+1);
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

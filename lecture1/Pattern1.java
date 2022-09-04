package Lec1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of the row: ");
        n=obj.nextInt();
        int row=1;
        int start=n;
        int space=0;

        while(row<=n)
        {
            int i=1,j=1;
            while(i<=space) {
                System.out.print("  ");
                i++;
            }
            while(j<=start){
                System.out.print("* ");
                j++;
            }
            space +=2;
            start--;
            System.out.println();
            row++;
        }
    }
}

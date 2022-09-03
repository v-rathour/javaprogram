package Lec1;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n;
        n=obj.nextInt();
        int space=0;
        int row=0;
        int start=0;
        while(row<n)
        {
            int i=0;
            while(i<n-1-row)
            {
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j<=start){
                System.out.print("*");
                j++;
            }
            space--;
            start +=2;
            System.out.println();
            row++;

        }
    }
}

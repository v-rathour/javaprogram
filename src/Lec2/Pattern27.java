package Lec2;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        n=obj.nextInt();
        int start=0;
        int space=n-1;
        int row=0;
        while(row<n){
            int i=0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j<=row)
            {
                System.out.print("*");
                j++;
            }
            space--;
            start++;
            System.out.println();
            row++;
        }
    }
}

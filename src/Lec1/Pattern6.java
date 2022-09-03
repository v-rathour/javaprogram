package Lec1;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]){
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int row=0;
        int space=0;
        int start=0;
        while(row<n)
        {
            int i=0;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j<(n*2)-start-1){
                System.out.print("*");
                j++;
            }
            space++;
            row++;
            start +=2;
            System.out.println();
        }
    }
}

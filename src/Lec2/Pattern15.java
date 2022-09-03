package Lec2;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of the row: ");
        n=obj.nextInt();
        int row=1;
        int start=n;
        int space=0;

        while(row<=2*n-1)
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
            if(row<n){
                space +=2;
                start--;
            }
            if(row>=n){
                space -=2;
                start++;
            }
            System.out.println();
            row++;
        }
    }
}

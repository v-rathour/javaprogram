package Lec2;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        n=obj.nextInt();
        int row=1;
        int space=-1;
        int start=n/2+1;
        while(row<=n)
        {
            int i=1;
            while(i<=start)
            {
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(row==1||row==n)
                k=2;
            while(k<start){
                System.out.print("* ");
                k++;
            }
            if(row<=n/2)
            {
                space--;
                start +=2;
            }else{
                space++;
                start -=2;
            }
            System.out.println();
            row++;
        }

    }
}

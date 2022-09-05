package ShortingPackage;

import java.util.Scanner;

public class bubbleShort {
    public static void main(String args[])
    {
        int size;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        size=obj.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the "+(i+1)+" element of array:");
            array[i]=obj.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
               if(array[j]>array[j+1])
               {
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
            }

        }
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
//time complexity=o(n^2)
//space complexity=0(1)

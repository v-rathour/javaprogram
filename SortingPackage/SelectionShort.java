package ShortingPackage;

import java.util.Scanner;
public class SelectionShort {
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
            int minIndex=i;
            for(int j=i+1;j<size;j++)
            {
                if(array[minIndex]>array[j])
                    minIndex=j;
            }
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
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

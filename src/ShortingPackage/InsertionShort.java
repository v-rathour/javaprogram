package ShortingPackage;

import java.util.Scanner;

public class InsertionShort {
    public static void main(String[] args)
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
        for(int i=0;i< array.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(array[j-1]>array[j])
                {
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
//Best case=o(n)
//worst case=0(n^)
//Average case=o(n^2)
//import java.util.Scanner;
//public class ArrayClass
//{
//    public static void main(String args[])
//    {
//        int i;
//        int array[]=new int[5];
//        Scanner obj=new Scanner(System.in);
//        for(i=0;i<5;i++)
//        {
//            System.out.print("Enter the Array["+(i+1)+"] element of the array:");
//            array[i]=obj.nextInt();
//
//        }
//       for(i=0;i<5;i++)
//       {
//           System.out.println("Array["+(i+1)+"]="+array[i]);
//       }
//    }
//}

//import java.util.Scanner;
//class ArrayClass
//{
//    public static void main (String args[])
//    {
//        int row,colum;
//        int i,j;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number of the rows:");
//        row=obj.nextInt();
//        System.out.print("Enter the number of the colum:");
//        colum=obj.nextInt();
//        int array[][]=new int[row][colum];
//        System.out.println("Enter the element of the array:");
//        for(i=0;i<row;i++)
//        {
//            for(j=0;j<colum;j++)
//            {
//                System.out.print("Enter the Array["+i+"]["+j+"] element of the array:");
//                array[i][j]=obj.nextInt();
//            }
//        }
//        for(i=0;i<row;i++)
//        {
//            for(j=0;j<colum;j++)
//            {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class ArrayClass
//{
//    public static void main(String args[])
//    {
//        int i,j;
//
//        for(i=0;i<5;i++)
//        {
//            vikash:
//            for(j=0;j<5;j++)
//            {
//                if(i==3)
//                {
//                    continue vikash;
//                }
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//}

//jagged array
//import java.util.Scanner;
//public class ArrayClass
//{
//    public static void main(String args[])
//    {
//        int row,colum;
//        int i,j;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number of row of the matrix:");
//        row=obj.nextInt();
//        int array[][]=new int[row][];
//        for(i=0;i<row;i++)
//        {
//            System.out.println("Enter the number of colum of the "+i+" row:");
//            colum=obj.nextInt();
//            array[i]=new int[colum];
//            for(j=0;j<colum;j++)
//            {
//
//                System.out.print("Enter the array["+i+"]["+j+"]element of the matrix:");
//                array[i][j]=obj.nextInt();
//            }
//            System.out.println();
//        }
//        for(i=0;i<row;i++)
//        {
//            for(j=0;j<array[i].length;j++)
//            {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
////Class conscept
//public class ArrayClass
//{
//    public static void main(String args[])
//    {
//       AkashRathour obj=new AkashRathour(56,89);
////        AkashRathour obj1 =new AkashRathour();
//        if(obj.flag==1)
//        {
//            System.out.print("Fibonacci series is print.");
//        }
//    }
//}
//class AkashRathour
//{
//    static int flag=0;
//    AkashRathour()//constructor
//    {
//        int num;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number to print Fibonacci series:");
//        num=obj.nextInt();
//        int a=-1,b=1,c;
//        while(num!=0)
//        {
//            c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//            num-=1;
//        }
//        System.out.println();
//        flag=1;
//    }
//    AkashRathour(int a,int b)
//    {
//        int total;
//        total=a+b;
//        System.out.println("Total ="+total);
//    }
//}

////JAGGED ARRAY
//int array[][]=new int[3][]
//array[0]=new int[a]
//array[1]=new int[b]
//array[2]=new int[c]

//import java.util.Scanner;
//public class ArrayClass
//{
//    public static void main(String args[])
//    {
//        int array[]={45,29,20,54,29,72};
//        int size,num ,indx;
//        int p=0;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number of insert element:");
//        size=obj.nextInt();
//        int array1[]=new int[array.length+size];
//        int l= array.length;
//        for(int i=0;i<size;i++)
//        {
//            System.out.print("Enter the index of "+i+" element where you want to insert :");
//            indx=obj.nextInt();
//            System.out.print("Enter the "+i+" element :");
//            num=obj.nextInt();
//            for(int j=0;j<array1.length;j++)
//            {
//                if(j==indx)
//                {
//                   array1[j]=num;
//                }
//                else if(l>=p)
//                {
//                   array1[j]=array[p];
//                    p++;
//                }
//            }
//        }
//        for(int k:array1)
//        {
//            System.out.println(k);
//        }
//    }
//}

//import java.util.Scanner;
//public class ArrayClass
//{
//    public static void main(String args[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int n,m;
//        System.out.print("Enter the number of element of the array:");
//        n=obj.nextInt();
//        int array[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            System.out.print("Enter the "+(i+1)+" element of the array:");
//            array[i]=obj.nextInt();
//        }
//        for(int i:array)
//        {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.print("Enter the index where user want to delete element:");
//        m=obj.nextInt();
//        int k=0;
//        int array1[]=new int[array.length-1];
//        for(int i=0;i< array.length;i++)
//        {
//            if(i==m)
//                continue;
//            else {
//                array1[k]=array[i];
//                k++;
//            }
//        }
//        for(int i:array1)
//        {
//            System.out.print(i+" ");
//        }
//    }
//}

//import java.util.Scanner;
//public class ArrayClass
//{
//    int size;
//    int array[]=new int[size];
//    public static void main(String args[])
//    {
//        Scanner obj=new Scanner(System.in);
//        ArrayClass obj1=new ArrayClass();
//        obj1.input();
//        obj1.display();
//    }
//    void input()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number of element of the array:");
//        size=obj.nextInt();
//        for(int i=0;i<size;i++)
//        {
//            System.out.print("Enter the "+(i+1)+" element of the array:");
//            array[i]=obj.nextInt();
//        }
//    }
//    void display()
//    {
//        for(int i:array)
//        {
//            System.out.print(i+" ");
//        }
//    }
//}

import java.util.Scanner;
public class ArrayClass
{
    public static void main(String args[])
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=obj.nextInt();
       int array[]=new int[n];
       for(int i=0;i<n;i++)
       {
           System.out.print("Enter the "+(i+1)+" element of the array:");
           array[i]=obj.nextInt();
       }
       System.out.println("Unsorted array:");
       for(int i:array)
       {
           System.out.print(i+" ");
       }
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(array[i]>array[j])
               {
                   int temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
               }
           }
       }System.out.println();
       System.out.println("Sorted array:");
        for(int i:array)
        {
            System.out.print(i+" ");
        }

    }
}
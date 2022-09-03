//public class petternClass
//{
//    public static void main(String args[])
//    {
//        int k=1;
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(k+" ");
//                k++;
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                if((i+j)%2==0)
//                {
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String rags[])
//    {
//        for(int i=0;i<4;i++)
//        {
//            for (int j = 0; j < 8; j++)
//            {
//                if (((i + j) <= 2 * i) || ((i + j) >= 7)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//            for (int i = 3; i >= 0; i--)
//            {
//                for (int j = 7; j >= 0; j--)
//                {
//                    if (((i + j) <= 2 * i) || ((i + j) >= 7))
//                    {
//                        System.out.print("*");
//                    } else
//                    {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        int k=0;
//        for(int i=4;i>=0;i--)
//        {
//            for(int j=0;j<9;j++)
//            {
//                if(j>=i&&j<=i*2+k)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//            k++;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        int row;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the size of the row:");
//        row=obj.nextInt();
//        for(int i=0;i<row;i++)
//        {
//            for(int j=row-1-i;j>=0;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<6;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<5;i++)
//        {
//            for(int j=5-1-i;j>=0;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=5-1-i;j>=0;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<6;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                if(j==1&&i==0||j!=1||i==2)
//                {
//                    if(j==2&&i==0)
//                    {
//                        System.out.print(" ");
//                    }
//                    else {
//                        System.out.print("*");
//                    }
//
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<9;j++)
//            {
//                if(i==4||j==0||j==2)
//                {
//                    if(j==2&&i==0) {System.out.print(" ");}
//                    else {System.out.print("*");}
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=4;i>=0;i--)
//        {
//            for(int j=0;j<9;j++)
//            {
//                if(i==4||j==0||j==2)                         //*********
//                {                                            //* *
//                    if(j==2&&i==0) {System.out.print(" ");}  //* *
//                    else {System.out.print("*");}            //* *
//                }                                            //*
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        *
//        * *
//        * *
//        * *
//        * *
//        * *
//        * *
//        * *
//        *
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<9;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                if(j==1||j==2&&i==0||j==2&&i==8)
//                {
//                    System.out.print(" ");
//                }
//                else
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            int k=1;
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(k+" ");
//                k++;
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                if(i==1||j==0||j==i)
//                {
//                    System.out.print("1");
//                }
//                else
//                {
//                    System.out.print(i);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//                 *
//               * *
//             * * *
//           * * * *
//         * * * * *
//public class petternClass
//{
//    public static void main(String rgs[])
//    {
//        for(int i=4;i>=0;i--)
//        {
//            for(int j=0;j<5;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//       * * * * *
//         * * * *
//           * * *
//             * *
//               *
//public class petternClass
//{
//    public static void main(String rgs[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                if(j<i)
//                {
//                    System.out.print(" ");
//                }
//                else
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//public class petternClass
//{
//    public static void main(String rgs[])
//    {
//        for(int i=0;i<4;i++)
//        {
//            for(int j=0;j<6;j++)
//            {
//                if((j+i)%2==0)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//       * * *  * * * * * *
//         * * * * * * *
//           * * * * *
//             * * *
//               *
//import java.util.Scanner;
//
//public class petternClass
//{
//    public static void main(String rgs[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int row,colum;
//        System.out.print("Enter the size of the row:");
//        row= obj.nextInt();
//        System.out.print("Enter the size of the colum:");
//        colum=obj.nextInt();
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<colum;j++)
//            {
//                if(j<i||j>=colum-i)
//                {
//                   System.out.print(" ");
//                }
//                else
//                {
//                System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        Enter the size of the row:3
//        Enter the size of the colum:5
//            * * *
//             * *
//              *
//import java.util.Scanner;
//public class petternClass
//{
//    public static void main(String rgs[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int row,colum;
//        System.out.print("Enter the size of the row:");
//        row= obj.nextInt();
//        System.out.print("Enter the size of the colum:");
//        colum=obj.nextInt();
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<colum;j++)
//            {
//                if(j<i||j>=colum-i)
//                {
//                    System.out.print(" ");
//                }
//                else
//                {
//                    if((i+j)%2!=0)
//                    {
//                        System.out.print(" ");
//                    }
//                    else {
//                        System.out.print("*");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//public class petternClass
//{
//    public static void main(String rgs[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int row,colum;
//        int k=0;
//        System.out.print("Enter the size of the row:");
//        row= obj.nextInt();
//        System.out.print("Enter the size of the colum:");
//        colum=obj.nextInt();
//        for(int i=row-1;i>=0;i--)
//        {
//            for(int j=0;j<colum;j++)
//            {
//
//                if(j<i||j>i+2*k)
//                {
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//            k++;
//        }
//    }
//}

//        * * *
//         * *
//          *
//         * *
//        * * *
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                if(i==j||i+j==4||i==0&&j==2||i==4&&j==2)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//            *
//          *
//        *
//      *
//    *
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                if(i+j==4)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//           *
//          * *
//         *   *
//        *     *
//import java.util.Scanner;
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int row,colum;
//        int k=0;
//        System.out.print("Enter the size of the row:");
//        row= obj.nextInt();
//        System.out.print("Enter the size of the colum:");
//        colum=obj.nextInt();
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<colum;j++)
//            {
//                if(j==row-1-i||j==row-1+i)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        *       *
//         *     *
//          *   *
//           * *
//            *
//import java.util.Scanner;
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int row,colum;
//        int k=0;
//        System.out.print("Enter the size of the row:");
//        row= obj.nextInt();
//        System.out.print("Enter the size of the colum:");
//        colum=obj.nextInt();
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<colum;j++)
//            {
//                if(j==i||i+j==(row-1)*2)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//public class petternClass
//{
//    public static void main(String args[])
//    {
//        Scanner obj=new Scanner(System.in);
//        int row,colum;
//        int k=0;
//        System.out.print("Enter the size of the row:");
//        row= obj.nextInt();
//        System.out.print("Enter the size of the colum:");
//        colum=obj.nextInt();
//
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<colum;j++)
//            {
//                if(i+j==2||i-j==2||i-j==-2||i%3==0&&j%3==0&&i!=0&&j!=0)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class petternClass
{
    public static void main(String args[])
    {
        System.out.println();
    }
}
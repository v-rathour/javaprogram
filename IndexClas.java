import java.util.Scanner;
//public class IndexClass
//{
//    public static void main(String args[])
//    {
//          char array[]=new char[5];
//          Scanner obj=new Scanner(System.in);
//          for(int i=0;i<5;i++)
//          {
//              System.out.print("Enter the value of array["+i+"]:");
//              array[i]=obj.next().charAt(0);
//          }
//         for(char i:array)
//         {
//             System.out.println(i);
//         }
//    }
//}

//import java.util.Scanner;
//public  class IndexClass
//{
//    public static void main(String args[])
//    {
//        int row_no,column;
//        Scanner obj=new Scanner(System.in);
//        System.out.println("Enter the row size:");
//        row_no=obj.nextInt();
//        System.out.println("Enter the column size:");
//        column=obj.nextInt();
//        char array[][]=new char[row_no][column];
//        for(int i=0;i<row_no;i++)
//        {
//            for(int j=0;j<column;j++)
//            {
//                System.out.print("Enter the element of matrix at array["+i+"]["+j+"]:");
//                array[i][j]=obj.next().charAt(0);
//
//            }
//        }
//        for(int i=0;i<row_no;i++)
//        {
//            System.out.println(array[i].length);
//            for(int j=0;j<column;j++)
//            {
//                System.out.print("matrix["+i+"]["+j+"]="+array[i][j]+"    ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//public class IndexClass
//{
//    public static void main(String args[])
//    {
//        int row_no,column;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the size of the row of the matrix:");
//        row_no=obj.nextInt();
//       char array[][]=new char[row_no][];
//        for(int i=0;i<row_no;i++)
//        {
//            System.out.print("Enter the size of the "+i+" row:");
//            column=obj.nextInt();
//            array[i]=new char[column];
//            for(int j=0;j<column;j++)
//            {
//                System.out.print("Enter the element of matrix at array["+i+"]["+j+"]:");
//                array[i][j]=obj.next().charAt(0);
//
//            }
//        }
//        for(int i=0;i<row_no;i++)
//        {
//            System.out.println(array[i].length);
//            for(int j=0;j< array[i].length;j++)
//            {
//                System.out.print("matrix["+i+"]["+j+"]="+array[i][j]+"    ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class IndexClass
//{
//     public static void main(String args[])
//     {
//         char ch='a';
//         System.out.println(Character.isUpperCase(ch));
//         System.out.println(Character.isLowerCase(ch));
//         System.out.println(Character.toUpperCase(ch));
//         char ch1='A';
//         System.out.println(Character.toLowerCase(ch1));
//         System.out.println(Character.isDigit('4'));
//         System.out.println(Character.isWhitespace('\n'));
//         System.out.println(Character.isLetter(ch));
//         System.out.println(Character.toString(ch));
//     }
//}

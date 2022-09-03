//import java.util.Scanner;
//
//public class StaticVariable
//{
//    public static void main(String args[])
//        {
//            static_variable obj=new static_variable();
//            static_variable obj2=new static_variable();
//            obj.input();
//            obj2.input();
//            System.out.println("The name of the student is "+obj.name+".");
//            System.out.print("the age of the student is "+obj.age+".");
//            System.out.println("The name of the student is "+obj2.name+".");
//            System.out.println("the age of the student is "+obj2.age+".");
//        }
//    }
//    class static_variable
//    {
//        static int age;
//        static String name;
//        void input()
//        {
//            Scanner obj1=new Scanner(System.in);
//            System.out.print("Enter the name of the student:");
//            name=obj1.nextLine();
//            System.out.print("Enter the age of the student:");
//            age=obj1.nextInt();
//        }
//    }
//////INSTANCE METHODE////
//import java.util.Scanner;
//class StaticVariable
//{
//    public static void main(String args[])
//    {
//        StaticVariable obj=new StaticVariable();
//        obj.addition();
//        System.out.println("//End program//");
//    }
//
//    void addition()
//    {
//        int a,b,total;                 //Local variable
//        Scanner obj1=new Scanner(System.in);
//        System.out.print("Enter the value of the a:");
//        a=obj1.nextInt();
//        System.out.print("Enter the value of the b:");
//        b=obj1.nextInt();
//        total=a+b;
//        System.out.println("The sum of two number is "+total+".");
//    }
//}

/////INSTANCE METHODE WITH PARAMETER//////
//import java.util.Scanner;
//class StaticVariable
//{
//    public static void main(String args[])       // Static methode
//    {
//        int a,b;                                                   //Instance methode
//        StaticVariable obj=new StaticVariable();
//        Scanner obj1=new Scanner(System.in);
//        System.out.print("Enter the value of the a:");
//        a=obj1.nextInt();
//        System.out.print("Enter the value of the b:");
//        b=obj1.nextInt();
//        obj.addition(a,b);                              //Colling of Instance methode
//        System.out.println("//End program//");
//    }
//
//    void addition(int a,int b)              //Instance methode
//    {
//        int total;
//        total=a+b;
//        System.out.println("The sum of two number is "+total+".");
//    }
//}


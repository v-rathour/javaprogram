import java.util.Scanner;

public class InstanceMethod
{
    public static void main(String args[])
    {
        String collage;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the collage name:");
        collage=obj.nextLine();
        Aryan obj1=new Aryan();
        obj1.text1(collage);
        System.out.print("Student name: "+obj1.test());

    }
}
class Aryan
{
    String name;
    String test()
    {
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the your name:");
        name=obj1.nextLine();
        return name;
    }
    void text1(String str)
    {
        System.out.println("Collage name: "+str);
    }
}

//calling static method in static method
//public class InstanceMethod
//{
//    public static void main(String args[])
//    {
//        methode();            //calling of static methode
//        System.out.println("Program End");
//    }
//    static void methode()          //static methode
//    {
//        int a=36,b=48;  //local variable
//        int total;
//        total=a+b;
//        System.out.println("Addition="+total);
//    }
//}

//public class InstanceMethod
//{
//    int num=56;  //Instance variable
//    static String name="Vikash";             //static variable
//    public static void main(String args[])
//    {
//        float a=56.9f;    //Local variable
//        System.out.println("Static variable="+name);
//        System.out.println("Local variable="+a);
////        System.out.println("instance variable="+num);
//    }
//}

//Super keyword used to access super class methode and variable which hide by child class
import java.util.Scanner;
public class Super1Class
{
   public static void main(String args[])
   {
       SonClass obj=new SonClass();
       obj.disp();

   }
}
class FatherClass
{
   int a;
   void input()
   {
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter the the value of the a in Super class:");
       a=obj.nextInt();
   }
}
class SonClass extends FatherClass
{
   int a;
   void input()
   {
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter the the value of the a in Sub class:");
       a=obj.nextInt();
   }
   void disp()
   {
       super.input();
       input();
       System.out.println("The value of the A in super class="+super.a);
       System.out.println("The value of the A in super class="+a);
    }
}

//Super keyword used to access super class default constructor by child class
class Super1Class
{
   public static void main(String args[])
   {
       TestClass1 obj=new TestClass1();
   }
}
class TestClass
{
   TestClass()
   {
       int a=56;
       System.out.println("The value of a="+a);
       System.out.println("It is execute by Super Class.");
   }
}
class TestClass1 extends TestClass
{
   TestClass1()
   {
       int b=46;
       System.out.println("The value of b="+b);
       System.out.println("It is execute by Child class");
   }
}

//Super keyword used to access super class parameterized constructor by child class
class Super1Class
{
   public static void main(String args[])
   {
       TestClass1 obj=new TestClass1(567);
   }
}
class TestClass
{
   TestClass(int a)
   {
       System.out.println("The value of a="+a);
       System.out.println("It is execute by Super Class.");
   }
}
class TestClass1 extends TestClass
{
   TestClass1(int x)
   {
       super(100);
       int b=x;
       System.out.println("The value of b="+b);
       System.out.println("It is execute by Child class");
   }
}

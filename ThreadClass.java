///Thread Schedule
//class MyThread extends Thread
//{
//    public void run()
//    {
//        for(int i=0;i<3;i++)
//        {
//            System.out.println("Child Thread");
//        }
//    }
//}
//public class ThreadClass
//{
//    public static void main(String args[])
//    {
//        MyThread obj=new MyThread();
//        obj.start();
//        for(int i=0;i<3;i++)
//        {
//            System.out.println("main Thread");
//        }
//    }
//}

//class SonClass extends Thread
//{
//        public void run()
//        {
//            System.out.println("Child class="+Thread.currentThread().getName());
//            System.out.println("Child class="+Thread.currentThread().getPriority());
//        }
//        SonClass(String name)
//        {
//           super(name);
//        }
//}
//public class ThreadClass
//{
//    public static void main(String args[])
//    {
//        Thread.currentThread().setPriority(8);
//        SonClass obj=new SonClass("vikash");
//        obj.start();
//        System.out.println("Parent class="+Thread.currentThread().getName());
//        System.out.println("Parent class="+Thread.currentThread().getPriority());
//    }
//}

//Implement Thread abstract class
//class SonClass implements Runnable
//{
//    public void run()
//    {
//     int a=10,b=56;
//     System.out.println("Child class="+(a+b));
//     System.out.println(Thread.currentThread().getName());
//    }
//}
//public class ThreadClass
//{
//    public static void main(String args[])
//    {
//        SonClass obj=new SonClass();
//        Thread t=new Thread(obj,"vikash");
//        t.start();
//        System.out.println("main class="+Thread.currentThread().getName());
//    }
//}

//class SonClass extends Thread
//{
//    public void run()
//    {
//        int a=-1,b=1,c,num=5;
//        while(num!=0)
//        {
//            c=a+b;
//            System.out.print(c+"  ");
//            try
//            {
//                Thread.sleep(3000);
//            }
//            catch(InterruptedException e){}
//            a=b;
//            b=c;
//            num-=1;
//        }
//        System.out.println();
//    }
//}
//public class ThreadClass
//{
//    public static void main(String args[]) throws InterruptedException
//    {
//        SonClass obj=new SonClass();
//        obj.start();
//        obj.join();
//        System.out.println("Main class="+Thread.currentThread().getName());
//        System.out.println("Main class="+Thread.currentThread().getPriority());
//    }
//}

//class SonClass extends Thread
//{
//    @Override
//    public void run() {
//        System.out.println("Thread name=" + Thread.currentThread().getName());
//        System.out.println("Thread priority=" + Thread.currentThread().getPriority());
//        Thread.yield();
//        Thread.currentThread().setPriority(4);
//        System.out.println(Thread.currentThread().getPriority());
//    }
//}
//public class ThreadClass
//{
//    public static void main(String args[])
//    {
//     SonClass obj=new SonClass();
//     obj.start();
//     System.out.println("class name="+Thread.currentThread().getName());
//     System.out.println("Class Priority="+Thread.currentThread().getPriority());
//    }
//}
//class SonClass implements Runnable
//{
//    static Thread myc;
//    public void run()
//    {
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName());
//        try
//        {
//            myc.join();
//        }
//        catch(InterruptedException e){
//    }
//    }
//}
//public class ThreadClass
//{
//    public static void main(String rags[]) throws InterruptedException
//    {
//        SonClass.myc=Thread.currentThread();
//        SonClass obj=new SonClass();
//        Thread t=new Thread(obj);
//        Thread.currentThread().setName("main class");
//        t.setName("vikash rathour");
//        t.start();
//        System.out.println("priority of the main class="+Thread.currentThread().getPriority());
//        System.out.println("Name of the main class="+Thread.currentThread().getName());
//    }
//}

//import java.util.Scanner;
//public class ThreadClass
//{
//    public static void main(String args[])
//    {
//        ExplainClass obj=new ExplainClass();
//        obj.Student();
//        obj.disp();
//    }
//}
//interface SonClass
//{
//    public static final int num=45;
//    abstract void disp();
//}
//interface ChildClass extends SonClass
//{
//    int roll_no=2115001117;
//    void Student();                 //abstract methode
//}
//class ExplainClass implements SonClass,ChildClass
//{
//    String name;
//    public void Student()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.println("Enter the name of the Student:");
//        name=obj.nextLine();
//    }
//
//    @Override
//    public void disp() {
//        System.out.println("Roll number="+roll_no);
//        System.out.println("Name="+name);
//        System.out.println("Getting number="+num);
//    }
//}
//import java.util.Scanner;
//class BalanceInSufficient extends Exception
//{
//    BalanceInSufficient()
//    {
//        super("Insufficient balance");
//    }
//}
//public class ThreadClass
//{
//    public static void main(String args[])  throws BalanceInSufficient
//    {
//        int a,b,multi;
//        Scanner obj=new Scanner(System.in);
//        System.out.println("Enter the value of the a:");
//        a=obj.nextInt();
//        System.out.println("Enter the value of the b:");
//        b=obj.nextInt();
//        try
//        {
//            multi=a/b;
//        }
//        catch(ArithmeticException e)
//        {
//            throw new BalanceInSufficient();
//        }
//        System.out.println("Multiplication="+multi);
//    }
//}
//character Methode
//isUpperCase()
//isLowerCase()
//ToUppercase()
//ToLowercase()
//ToString()
//isDigit()
//isLetter()

//String methode
//toUpperCase()
//ToLowerCase()
//remove()
//insert()

////single inheritance
//public class InteritenceClass
//{
//    public static void main(String args[])
//    {
//        Test1class obj=new Test1class();
//        obj.add();
//        obj.multipication();
//    }
//}
//class TestClass             //PRINCIPLE CLASS /SUPER CLASS
//{
//    int a=10,b=38;
//    void add()
//    {
//        int total;
//        total=a+b;
//        System.out.println("Addition="+total);
//    }
//
//}
//class Test1class extends TestClass                  //SUP CLASS /CHILD CLASS
//{
//    void multipication()
//    {
//        int total;
//        total=a*b;
//        System.out.println("Multipication="+total);
//    }
//}

                      //Multi-level inheritance
//import java.util.Scanner;
//class InteritenceClass
//{
//    public static void main(String args[])
//    {
//        GrandSonClass obj=new GrandSonClass();
//        obj.display();
//    }
//}
//class FatherClass  //Superclass
//{
//    int a,b;
//    int  add()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the integer number:");
//        a=obj.nextInt();
//        System.out.print("Enter the second integer number:");
//        b=obj.nextInt();
//        int total;
//        total=a+b;
//        return total;
//    }
//}
//class SonClass extends FatherClass                     //sub class of FatherClass
//{
//    int Multipication()
//    {
//        int total;
//        total=a*b;
//        return total;
//    }
//}
//class GrandSonClass extends SonClass                     //sub class of Sonclass
//{
//    void display()
//    {
//        System.out.println("Addition"+add());
//        System.out.println("The value of a="+a);
//        System.out.println("The value of b="+b);
//        System.out.println("Multipication="+Multipication());
//    }
//}
                  //h
//import java.util.Scanner;
//
//class InteritenceClass
//{
//    public static void main(String args[])
//    {---------------
//        SonClass obj=new SonClass();
//        DaughterClass obj1=new DaughterClass();
//        obj.input();
//        obj.add();
//        obj1.input();
//        obj1.multipication();
//    }
//}
//class FatherClass
//{
//    int a,b;
//    String name;
//    void input ()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the name of the user:");
//        name=obj.nextLine();
//        System.out.print("Enter the value of the a:");
//        a=obj.nextInt();
//        System.out.print("Enter the value of the b:");
//        b=obj.nextInt();
//
//    }
//}
//class SonClass extends FatherClass
//{
//    void add()
//    {
//        int total;
//        total=a+b;
//        System.out.println("Addition="+total);
//
//    }
//}
//class DaughterClass extends FatherClass
//{
//    void multipication()
//    {
//        int total;
//        total=a*b;
//        System.out.println("Multipication="+total);
//    }
//}
                                  ////interface inheritance
                            ////one interface implements in a single class
//import java.util.Scanner;
//class InteritenceClass
//{
//    public static void main(String args[])
//    {
//        Display obj=new Display();         //Object of implemented class
//        obj.Employees();
//        obj.salary();
//        obj.disp();
//    }
//}
//interface CompanyClass1                    //interface 1
//{
//   public static final int employee_no=50;         //static variable
//    void Employees();                          //Abstract methode
//    void salary();                        //Abstract methode
//}
//interface CompanyClass2
//{
//    public static final String honour="Shri Shyam singh Rathour";                    // Constant/static variable
//    void disp();                 //Abstract methode
//}
//class Display implements CompanyClass1,CompanyClass2            // implemented class of interface
//{
//    int salary_manager,salary_em;           //instance variable
//    String manager_name,company_name;     //instance variable
//    public void Employees()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the  company name:");
//        company_name=obj.nextLine();
//        System.out.print("Enter the manager name:");
//        manager_name=obj.nextLine();
//
//    }
//    public void  salary()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the salary of the manager:");
//        salary_manager=obj.nextInt();
//        System.out.print("Enter the salary of the employees:");
//        salary_em=obj.nextInt();
//    }
//    public void disp()
//    {
//        System.out.println("Company honour="+CompanyClass2.honour);
//        System.out.println("Manager name="+manager_name);
//        System.out.println("Manager salary="+salary_manager);
//        System.out.println("COMPANY NAME:"+company_name);
//        System.out.println("Number of employees in this company="+CompanyClass1.employee_no);
//        System.out.println("Employees salary="+salary_em);
//    }
//
//}

//import java.util.Scanner;
//
////    multiple inheritance by interface
//class InteritenceClass
//{
//    public static void main(String args[])
//    {
//        Son obj=new Son();
//        obj.input();
//        obj.display();
//    }
//}
//class FatherClass                  //super class
//{
//    int a,b;             //instance variable
//    void input()        //instance method
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("ENter the value of the a:");
//        a=obj.nextInt();
//        System.out.print("Enter the value of the b:");
//        b=obj.nextInt();
//    }
//    int add()   //instance method
//    {
//        int total;
//        total=a+b;
//        return total;
//    }
//}
//interface MotherClass           //interface class
//{
//    public static final int c=56;    //static variable
//    int multiplication();           //abstract methode
//}
//class Son extends FatherClass implements MotherClass          //implements interface and sub class
//{
//    public int multiplication()
//    {
//        int multi;
//        multi=(a+b)*c;
//        return multi;
//    }
//    void display()
//    {
//        System.out.println("Addition of two number is "+add()+".");
//        System.out.println("Multiplication="+multiplication());
//    }
//}


//import java.util.Scanner;
//class InteritenceClass
//{
//    public static void main(String args[])
//    {
//        ResultClass obj=new ResultClass();
//        obj.input();
//        obj.subject();
////        obj.marks();
//        obj.display();
//    }
//}
//class StudeentClass
//{
//    String stu_name;
//    String str[]=new String[50];
//    int num;
//    int roll_no;
//    void input()
//    {
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the name of the student:");
//        stu_name=obj.nextLine();
//        System.out.print("Enter the roll number:");
//        roll_no=obj.nextInt();
//    }
//    void subject()
//    {
//        int i;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the total subject:");
//        num=obj.nextInt();
//        for(i=0;i<num;i++)
//        {
//            System.out.print("Enter the "+i+"subject:");
//            str[i]=obj.nextLine();
//        }
//    }
//}
//class ExamClass extends StudeentClass
//{
//
//    int array[]={50,34,93,10,56};
//    int i;
//
//
////    void marks()
////    {
////        System.out.println(num);
////        Scanner obj=new Scanner(System.in);
////        for(i=0;i<num-1;i++)
////        {
////                System.out.print("Enter the marks of "+i+" subject:");
////                array[i]=obj.nextInt();
////        }
////    }
//}
//interface Project
//{
//    public static final String name="Animated dictionary";
//    int marks=95;
//    void display();
//}
//class ResultClass extends ExamClass implements Project
//{
//    public void display()
//    {
//        System.out.println("Total subject and marks:");
//        System.out.println("Subject          Marks");
//        for(i=1;i<num;i++)
//        {
//            System.out.println(str[i]+"        "+array[i-1]);
//        }
//        System.out.println("Project name:="+Project.name);
//        System.out.println("Gating marks in Project+"+Project.marks);
//    }
//}

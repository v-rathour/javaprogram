//import java.util.Scanner;
//
//public class ExceptionHandling
//{
//    public static void main(String args[])
//    {
//        ExceptionHandling obj=new ExceptionHandling();
//        obj.check();
//    }
//    void check()
//    {
//        int a,b;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the value of the a:");
//        a=obj.nextInt();
//        System.out.print("Enter the value of the b:");
//        b=obj.nextInt();
//        int total;
//        try
//        {
//            total=a/b;
//            System.out.println("Total="+total);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("Division by zero invalid.");
//        }
//        System.out.println("Program is Execute successfully.");
//    }
//}

import java.util.Scanner;
class balanceNotSufficient extends RuntimeException
{
    balanceNotSufficient()
    {
        super("insufficient amount");
    }
}

public class ExceptionHandling
{
            public static void main(String args[]) throws balanceNotSufficient
    {
          Test obj=new Test();
          obj.balance();
          try
          {
              obj.balance();
          }
          catch (balanceNotSufficient e)
          {
              System.out.println(e);
          }
    }
}
class Test extends ExceptionHandling
{
    int amount=100000;
    public void balance() throws balanceNotSufficient
    {
        int transfer_amount;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the withdrow amount:");
        transfer_amount=obj.nextInt();
        if(amount>transfer_amount)
        {
            int remain=amount-transfer_amount;
            System.out.println("Amount="+remain);
        }
        else
        {
            throw new balanceNotSufficient();
        }
    }
}
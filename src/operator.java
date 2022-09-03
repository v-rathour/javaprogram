import java.util.Scanner;
class Operators
{
    int a,b;

    void add()
    {
        int total;
        total=a+b;
        System.out.println("Addition"+total);
    }
    void sub()
    {
        int total;
        if(a>b){
            total=a-b;
            System.out.println("Substration="+total);
        }
        else
        {
            total=b-a;
            System.out.println("Substartion="+total);
        }
    }

    void multi() {
        int total;
        total = a * b;
        System.out.println("Multipication=" + total);
    }
    void right()
    {
        int total;
        total=a>>b;
        System.out.println("Result of Right sift operator="+total);
    }
    void left_sift()
    {
        int total;
        total=a<<b;
        System.out.println("Result of Left sift operator="+total);
    }
    void bitwise_and()
    {
        int total;
        total=a&b;
        System.out.print("Result of bitwise And operator="+total);
    }

}
public class operator
{
    public static void main(String args[])
    {
        Operators obj=new Operators();
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the value of the a:");
        obj.a=obj1.nextInt();
        System.out.print("Enter the value of the b:");
        obj.b=obj1.nextInt();
//        obj.left_sift();
        obj.right();
    }
}




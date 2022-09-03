class vikas
{
    int a,b,total;
    void add()
    {
        total=a+b;
    }
}
class Example
{
    public static void main(String args[])
    {
        vikas obj=new vikas();
        obj.a=50;
        obj.b=23;
        obj.add();
        System.out.print("Addition="+obj.total);
    }
}

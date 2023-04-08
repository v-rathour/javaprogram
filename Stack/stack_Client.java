package Stack;

public class stack_Client  {
    public static void main(String[] args) throws Exception {
        Stack obj=new Stack(7);
        obj.push(5);
        obj.push(38);
        obj.push(34);
        obj.push(3);
        obj.push(39);

        obj.Display();

        System.out.println(obj.peek());
        obj.Display();
        System.out.println(obj.pop());

        obj.Display();
    }

}

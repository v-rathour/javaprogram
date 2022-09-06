public class MemoryStringClass
{
   public static void main(String args[])
   {
       String str=new String();              //memory allocated in heap and SCP(string constant pool)
       String str1;                              //memory allocated in heap and SCP(string constant pool)
       String str2="Aryan rathour";         //memory allocated in SCP only
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter the first string:");
       str=obj.nextLine();
       System.out.print("Enter the second string:");
       str1=obj.nextLine();
       System.out.println("First string="+str);
       System.out.println("Second string="+str1);
   }
}

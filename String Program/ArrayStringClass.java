public class ArrayStringClass
{
   public static void main(String args[])
   {
       String str[][]=new String[3][3];
          Scanner obj=new Scanner(System.in);
       System.out.println("Enter the string:");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
              System.out.print("Enter the string at index str["+i+"]["+j+"]=");
              str[i][j]=obj.nextLine();
           }
       }
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print("str["+i+"]["+j+"]="+str[i][j]);
           }
           System.out.println();
       }
   }
}

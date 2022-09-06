public class StringBufferClass
{
  public static void main(String args[])
  {
      Scanner obj=new Scanner(System.in);
      StringBuffer sb=new StringBuffer("vikash rathour");
//      System.out.println(sb.toString());
//      System.out.println(sb.charAt(7));
//      System.out.println(sb.insert(6,"vikas"));
//      System.out.println(sb);
//      System.out.println(sb.replace(6,12," "));
      System.out.println(sb.delete(7,14));
       System.out.println(sb);
       sb.append("rathour");
      System.out.println(sb);
      System.out.println(sb.deleteCharAt(6));
      sb.ensureCapacity(56);
      System.out.println(sb);
      System.out.println(sb.capacity());

//      String sb1=new String();
//      System.out.println("Enter the string Buffers:");
//      sb1=obj.nextLine();
//      sb.append(sb1);
//      System.out.print("StringBuffer="+sb);

//      StringBuffer sb1=new StringBuffer();
//      System.out.println(sb.capacity());
//      System.out.println(sb1.capacity());
//      System.out.println(sb.length());
//      sb.append("kumar");
//      System.out.println(sb);

  }
}

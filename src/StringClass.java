import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

//public class StringClass
//{
//    public static void main(String args[])
//    {
//        String str=new String();
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the string:");
//        str=obj.nextLine();
//        System.out.println("String="+str);
//    }
//}

//public class StringClass
//{
//    public static void main(String args[])
//    {
//        String str[][]=new String[3][3];
//        Scanner obj=new Scanner(System.in);
//        System.out.println("Enter the string:");
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//               System.out.print("Enter the string at index str["+i+"]["+j+"]=");
//               str[i][j]=obj.nextLine();
//            }
//        }
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                System.out.print("str["+i+"]["+j+"]="+str[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

//public class StringClass
//{
//    public static void main(String args[])
//    {
//        String str=new String();              //memory allocated in heap and SCP(string constant pool)
//        String str1;                              //memory allocated in heap and SCP(string constant pool)
//        String str2="Aryan rathour";         //memory allocated in SCP only
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the first string:");
//        str=obj.nextLine();
//        System.out.print("Enter the second string:");
//        str1=obj.nextLine();
//        System.out.println("First string="+str);
//        System.out.println("Second string="+str1);
//    }
//}

//public class StringClass
//{
//    public static void main(String args[])
//    {
////        char ch[]={'5','8','r','j'};
////      String str=new String(ch);
////      System.out.println(str);
//        //byte constructor
////        byte b[]={43,78,98,89};
////        String str=new String(b);
////        System.out.println(str);
//
////        String str="vikas Rathour";
////        System.out.println(str.charAt(8));
//
//        String str=new String("vikas rathour");
//        Character sb=new Character('f');
//        String str1=new String(" ");
//        System.out.println(str.compareTo("vikas rathour kumar"));
//        System.out.println(str.concat(" kumar"));
//        System.out.println(str.startsWith("vik"));
//        System.out.println(str.endsWith("rathour"));
//        System.out.println(str.toUpperCase());
//        System.out.println(str1.isBlank());
//        System.out.println(str1.isEmpty());
//        System.out.println(str.codePointBefore(6));
//        System.out.println(str.codePointAt(7));
//
//    }
//}

//stringBuffer
public class StringClass
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
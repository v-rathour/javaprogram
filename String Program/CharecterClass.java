public class CharecterClass
{
   public static void main(String args[])
   {
//        char ch[]={'5','8','r','j'};
//      String str=new String(ch);
//      System.out.println(str);
       //byte constructor
//        byte b[]={43,78,98,89};
//        String str=new String(b);
//        System.out.println(str);

//        String str="vikas Rathour";
//        System.out.println(str.charAt(8));

       String str=new String("vikas rathour");
       Character sb=new Character('f');
       String str1=new String(" ");
       System.out.println(str.compareTo("vikas rathour kumar"));
       System.out.println(str.concat(" kumar"));
       System.out.println(str.startsWith("vik"));
       System.out.println(str.endsWith("rathour"));
       System.out.println(str.toUpperCase());
       System.out.println(str1.isBlank());
       System.out.println(str1.isEmpty());
       System.out.println(str.codePointBefore(6));
       System.out.println(str.codePointAt(7));

   }
}

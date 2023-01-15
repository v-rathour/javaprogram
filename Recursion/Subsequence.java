package RecursionClass;

import java.util.HashSet;

public class Subsequence {
     static HashSet<String> set=new HashSet<>();
    public static void main(String[] args) {
       String str="abca";

       Recursion_sequence(str,"",set);
//        System.out.println(Count_sequence(str,"",0));
        System.out.println(set);
    }
    public static void Recursion_sequence(String s,String str,HashSet<String> set){

        if(s.length()==0){
            if(set.contains(str)==false)
                set.add(str);
            return;
        }
        char ch=s.charAt(0);
        Recursion_sequence(s.substring(1),str,set);
        Recursion_sequence(s.substring(1),str+ch,set);

    }
    public static int  Count_sequence(String s,String str,int count){

        if(s.length()==0){
            return 1;
        }
        char ch=s.charAt(0);
        int a=Count_sequence(s.substring(1),str,count+1);
        int b=Count_sequence(s.substring(1),str+ch,count+1);
       return a+b;
    }
}

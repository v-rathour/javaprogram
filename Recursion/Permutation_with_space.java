package RecursionClass;

import java.util.ArrayList;

public class Permutation_with_space {
    public static void main(String[] args) {
        String str="ab9hfb7";
//        permutation(str,"");
//        Permutation(str,"");
        Permutation_case(str,"");
    }
    public static void permutation(String str,String ans){
        if(str.length()==0 ){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        permutation(str.substring(1),ans+ch);
        if(str.length()!=1)
             permutation(str.substring(1),ans+ch+"_");
    }
    public static void Permutation(String str,String ans){
        if(str.length()==0 ){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String lpart=str.substring(0,i);
            String rpart=str.substring(i+1);
            String s=lpart+rpart;
            Permutation(s,ans+ch);
            if(str.length()!=1)
               Permutation(s,ans+ch+"_");

        }
    }
    public static void Permutation_case(String str, String ans ){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        char ch1=ch;
        if(ch>=97 && ch<=122)
            ch1=(char)((int)ch-32);
        else if(ch>=65 && ch<=90)
            ch1=(char)((int)ch+32);

        String s=str.substring(1);
        Permutation_case(s,ans+ch);
        if(ch>=65)
          Permutation_case(s,ans+ch1);


    }
}

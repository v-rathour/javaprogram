package RecursionClass;

import java.util.ArrayList;

public class Permutation_leetcode {

    static  ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        String str="123";
        ArrayList<Integer> list1=new ArrayList<>();
        Permutation(str,"",list1);
        System.out.println(list);
    }
    public static void Permutation(String str,String ans,ArrayList<Integer> list1 ){
        if(str.length()==0){
            list.add(list1);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            list1.add(ch-'0');
            String lpart=str.substring(0,i);
            String rpart=str.substring(i+1);
            String s=lpart+rpart;
            Permutation(s,ans+ch,list1);


        }
    }
}

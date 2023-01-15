package RecursionClass;

import java.util.ArrayList;

public class Keypad_combination {
    public static void main(String[] args) {
          ArrayList<String> list=Combination("574");
          for(String str:list){
              System.out.print(str+" ");
          }
    }
    static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","uvx","yz"};
    public static ArrayList<String> Combination(String str){
         if(str.length()==0){
             ArrayList<String> list=new ArrayList<>();
             list.add(" ");
             return list;
         }
         char ch=str.charAt(0);
         ArrayList<String> res=Combination(str.substring(1));
         ArrayList<String> mres=new ArrayList<>();

         String charcodech=codes[ch-'0'];
        for (int i = 0; i < charcodech.length(); i++) {
            char s=charcodech.charAt(i);
            for(String ans:res){
                mres.add(s+ans);
            }
        }
        return mres;
    }
}

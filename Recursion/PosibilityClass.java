package RecursionClass;

public class PosibilityClass {
    public static void main(String[] args) {
        int n=3;
        Recursuion("",n);

        Print(n,"");
        System.out.println(count_Possibility("",n));

        System.out.println(Print(n,""));
    }
    public static void Recursuion(String s,int n){
        if(n==s.length() ){

               System.out.println(s);
            return ;
        }
        if(s.length()==0||s.charAt(s.length()-1)!='H')
              Recursuion(s+"H",n);
        Recursuion(s+"T",n);


    }
        public static int  Print(int n,String ans){
              if(n==0){
                  System.out.println(ans+" ");
                  return 1;
               }
              int a=0;
              if(ans.length()==0||ans.charAt(ans.length()-1)!='H')
                  a=Print(n-1,ans+"H");
              int b=Print(n-1,ans+"T");
              return a+b;
        }
    public static int count_Possibility(String s,int n){
        if(n==s.length() ){
            return 1;
        }

        int a=count_Possibility(s+"H",n);
        int b=count_Possibility(s+"T",n);
        return a+b;

    }
}

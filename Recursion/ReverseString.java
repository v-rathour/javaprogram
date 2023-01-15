package RecursionClass;

public class ReverseString {
    public static void main(String[] args) {
        String s="nitin";
        String ans="";
        String str=Reverse(s.length()-1,0,s,ans);
        if(s.equals(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static String Reverse(int n,int i,String s,String ans){
        if(i==n){
            return ans+s.charAt(i);
        }
        return Reverse(n,i+1,s,ans)+s.charAt(i);
    }
}

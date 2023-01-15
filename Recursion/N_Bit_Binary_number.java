package RecursionClass;

public class N_Bit_Binary_number {
    public static void main(String[] args) {
        int n=5;
        Binary_Number(n,0,0,"");
    }
    public static void Binary_Number(int n,int ones,int zero,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        Binary_Number(n-1,ones+1,zero,ans+'1');
        if(zero<ones)
            Binary_Number(n-1,ones,zero+1,ans+'0');
    }
}

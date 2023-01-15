package RecursionClass;

public class Decimal_Binary {
    public static void main(String[] args) {
        int num=78;
        System.out.println(DecimalToBinary(num,1,0));
    }
    public static int DecimalToBinary(int n,int i,int ans){
        if(n==0)
            return ans;
        return DecimalToBinary(n/2,i*10,ans+(n%2)*i);
    }
}

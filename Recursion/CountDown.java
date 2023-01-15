package RecursionClass;

public class CountDown {
    public static void main(String[] args) {
        int num=5;
        PrintCountDown(num);
    }
    public static void PrintCountDown(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintCountDown(n-1);
    }
}

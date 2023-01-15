package RecursionClass;

public class fibbonnachhi {
    public static void main(String[] args) {
        int n=6;
       System.out.println(fib(n));
        fibbonachi(n,-1,1);
    }
  // First method to print last n+1 element 
   public static int fib(int n){
       if(n==0 || n==1)
            return n;
       int f1=fib(n-1);
       int f2=fib(n-2);
       return f1+f2;

   }
  // Print the n number of fibbonachhi serious
    public static void fibbonachi(int n,int a,int b){
        if(n==0)
            return;
        int c=a+b;
        System.out.print(c+" ");
        fibbonachi(n-1,b,c);
    }
}

package RecursionClass;

public class TowerOfHonoi {
    public static void main(String[] args) {
        int n=3;
        T_of_honoi(n,"A","C","B");
    }
//    public static void T_of_honoi(int n,String source,String aux,String destination){
//        if(n==1){
//            System.out.println("Move disk 1 from "+source+" to "+destination+".");
//            return;
//        }
//
//        T_of_honoi(n-1,source,destination,aux);
//        System.out.println("Move disk "+n+ "from "+source+" to "+destination+".");
//        T_of_honoi(n-1,aux,source,destination);
//        System.out.println("Move disk "+n+ "from "+source+" to "+destination+".");
//    }
    public static void T_of_honoi(int n,String source,String destination,String aux){
        if(n==0)
            return ;
        T_of_honoi(n-1,source,aux,destination);
        System.out.println("Move disk "+n+ " from "+source+" to "+destination+".");
        T_of_honoi(n-1,aux,destination,source);
    }
}

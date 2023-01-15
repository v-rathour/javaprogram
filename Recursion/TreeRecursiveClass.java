package RecursionClass;

public class TreeRecursiveClass {
    public static void main(String[] args) {
        int n=5;
        PrintTree(n);

    }
    public static void PrintTree(int n){
        if(n==0)
            return;
        System.out.println("Pre="+n);
        PrintTree(n-1);
        System.out.println("Inorder="+n);
        PrintTree(n-1);
        System.out.println("Post="+n);
    }
}

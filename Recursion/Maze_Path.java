package RecursionClass;

public class Maze_Path {
    public static void main(String[] args) {
        int n=3;
        int m=3;
//        Print_path(n,m,1,1,"");
        Print_Jump_path(n,m,1,1,"");
    }
    public static void Print_path(int n,int m,int i,int j,String ans){
        if(i==n && j==m){
            System.out.print(ans+" ");
            return;
        }
        if(i>n || j>m)
            return;
        Print_path(n,m,i,j+1,ans+'h');
        Print_path(n,m,i+1,j,ans+'v');
    }
    public static void Print_Jump_path(int n,int m,int i,int j,String ans){
        if(i==n && j==m){
            System.out.print(ans+" ");
            return;
        }
        if(i>n || j>m)
            return;
        for (int k = 1; k <=  m-j; k++) {
            Print_Jump_path(n,m,i,j+k,ans+'h'+k);

        }
        for (int k = 1; k <=n-i; k++) {
            Print_Jump_path(n,m,i+k,j,ans+'v'+k);
        }
        for (int k = 1; k <=n-i && k <=  m-j; k++) {
            Print_Jump_path(n,m,i+k,j+k,ans+'d'+k);
        }
    }
}

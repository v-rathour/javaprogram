package RecursionClass;

public class Borad_path {
    public static void main(String[] args) {

        int n=4;
        PrintPath(0,n,"");
        System.out.println("\nTotat Possibility: "+CountPath(0,n,""));
    }
    public static void PrintPath(int src,int des,String ans){
        if(src==des){
            System.out.print(ans+" ");
            return ;
        }
        if(src>des)
            return;
        PrintPath(src+1,des,ans+1);
        PrintPath(src+2,des,ans+2);
        PrintPath(src+3,des,ans+3);
    }
    public static int  CountPath(int src,int des,String ans){
        if(src==des){
            return 1;
        }
        if(src>des)
            return 0;
        int a=CountPath(src+1,des,ans+1);
        int b=CountPath(src+2,des,ans+2);
        int c=CountPath(src+3,des,ans+3);
        return a+b+c;
    }
}

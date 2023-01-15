package RecursionClass;

public class Flood_club {
    public static void main(String[] args) {
        int arr[][]={{0,1,0,0,0,0,0},{0,1,0,1,1,1,0},{0,0,0,0,0,0,0},{1,0,1,1,0,1,1},{1,0,1,1,0,1,1},{1,0,0,0,0,0,0}};
        boolean visited[][]=new boolean[arr.length][arr[0].length];
        Traverse_club(arr,0,0,"",visited);
    }
    public static void Traverse_club(int arr[][],int row,int col,String ans,boolean visited[][]){
        if(row<0 || col<0 || row==arr.length|| col==arr[0].length || arr[row][col]==1 || visited[row][col]==true)
             return;
        if(row==arr.length-1 &&  col==arr[0].length-1){
            System.out.println(ans+"end");
            return;
        }
        visited[row][col]=true;
        Traverse_club(arr,row-1,col,ans+"Top->",visited);
        Traverse_club(arr,row,col-1,ans+"Left->",visited);
        Traverse_club(arr,row+1,col,ans+"Buttom->",visited);
        Traverse_club(arr,row,col+1,ans+"Right->",visited);
        visited[row][col]=false;

    }
}

package RecursionClass;

public class Knight_tour {
    public static void main(String[] args) {
        int n=5;
        int chess[][]=new int[n][n];
        Recursion_Tour(chess,1,1,1);
    }
    public static void Recursion_Tour(int chess[][],int row,int col,int move){
        if(row<0 || col<0 || row>=chess.length || col>=chess.length || chess[row][col]>0)
            return;
        else if(move== chess.length* chess.length){
            chess[row][col]=move;
            display(chess);
            chess[row][col]=0;
        }

        chess[row][col]=move;
        Recursion_Tour(chess,row-2,col+1,move+1);
        Recursion_Tour(chess,row-1,col+2,move+1);
        Recursion_Tour(chess,row+1,col+2,move+1);
        Recursion_Tour(chess,row+2,col+1,move+1);
        Recursion_Tour(chess,row+2,col-1,move+1);
        Recursion_Tour(chess,row+1,col-2,move+1);
        Recursion_Tour(chess,row-1,col-2,move+1);
        Recursion_Tour(chess,row-2,col-1,move+1);
        chess[row][col]=0;

    }
    public static void display(int chess[][]){
        System.out.println("display:=");
        for (int[] row:chess) {
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

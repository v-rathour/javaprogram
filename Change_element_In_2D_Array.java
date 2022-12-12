import java.util.Scanner;

public class Change_element_In_2D_Array {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int arr[][]={{1,1,0,1,1},{1,1,1,1,1},{1,1,1,0,1},{1,1,1,1,1},{0,1,1,1,1}};
       for(int i=0;i<arr.length;i++){
           for (int j = 0; j < arr[0].length; j++) {
               System.out.print(arr[i][j]+"  ");
           }
           System.out.println();
       }
       int x=0;
       int y=0;
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[0][i]==0)
                x=1;
        }
        for (int i = 0; i < arr.length; i++) {
             if(arr[i][0]==0)
                 y=1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                 if(arr[i][j]==0){
                     arr[i][0]=0;
                     arr[0][j]=0;
                 }
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[0][i]==0){
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i]=0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]==0){
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j]=0;
                }
            }
        }
        if(x==1){
            for (int i = 0; i < arr[0].length; i++) {
                 arr[0][i]=0;
            }
        }
        if(y==1){
            for (int i = 0; i < arr.length; i++) {
                arr[i][0]=0;
            }
        }
        System.out.println("After the change:");
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
      }
}

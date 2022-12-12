import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i = 0; i < arr.length; i++) {
            Reverse_of_matrix(arr[i]);
        }
        Transpose_of_matrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void Reverse_of_matrix(int arr[]){
        int i=0;int j= arr.length-1;
       while(i<j){
           int tem=arr[i];
           arr[i]=arr[j];
           arr[j]=tem;
           i++;
           j--;
       }
    }
    public static void Transpose_of_matrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}

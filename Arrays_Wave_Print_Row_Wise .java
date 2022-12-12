public class Arrays_Wave_Print_Row_Wise {
    public static void main(String[] args) {
        int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
         Print_Row_Wise(arr);
    }
    public static void Print_Row_Wise(int arr[][]){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total= arr.length*arr[0].length;
        int count=0;
        while(count<total){
            for (int i = minc; i <=maxc && count<total; i++) {
                System.out.print(arr[minr][i]+", ");
                count++;
            }
            minr++;
            for (int i = maxc; i >=minc && count<total; i--) {
                System.out.print(arr[minr][i]+", ");
                count++;
            }
            minr++;

        }
    }
}

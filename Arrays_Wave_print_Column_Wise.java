public class Arrays_Wave_print_Column_Wise {
    public static void main(String[] args) {
        int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        print_Column_Wise(arr);
    }
    public static void print_Column_Wise(int arr[][]){
        int minr=0;
        int minc=0;
        int maxr= arr.length-1;
        int total= arr.length*arr[0].length;
        int count=0;
        while(count<total){
            for (int i = minr; i <=maxr && count<total; i++) {
                System.out.print(arr[i][minc]+", ");
                count++;
            }
            minc++;
            for (int i = maxr; i >=minr && count<total ; i--) {
                System.out.print(arr[i][minc]+", ");
                count++;
            }
            minc++;
        }
    }
}

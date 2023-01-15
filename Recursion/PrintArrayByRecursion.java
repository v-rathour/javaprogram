package RecursionClass;

public class PrintArrayByRecursion {
    public static void main(String[] args) {
        int arr[]={56,39,9,28,92};
        Head_Array_print(arr,arr.length-1);
        System.out.println("Print the array by tail recursion approach:");
        tail_Array_print(arr,0);
    }
    public static void Head_Array_print(int arr[],int n){
        if(n==-1)
            return;
        Head_Array_print(arr,n-1);
        System.out.println(arr[n]);
    }
    public static void tail_Array_print(int arr[],int n){
        if(n==arr.length)
            return;
        System.out.println(arr[n]);
        tail_Array_print(arr,n+1);
    }
}

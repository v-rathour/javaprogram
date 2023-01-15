package RecursionClass;

import java.util.ArrayList;

public class All_index_of {
    public static void main(String[] args) {
        int arr[]={3,4,6,3,8,9,3,9,6,9};
        ArrayList<Integer> list1=new ArrayList<>();

        int target=3;
//        ArrayList<Integer> list=indexOf(arr,0,list1,target);
//        for(int ans:list){
//            System.out.print(ans+" ");
//        }
        int arr1[]=indexof(arr,target,0,0);
        for(int ans:arr1){
            System.out.print(ans+" ");
        }
    }

    public static ArrayList<Integer> indexOf(int arr[],int n,ArrayList<Integer> list,int target){
        if(n==arr.length){
            return list;
        }
        if(arr[n]==target)
          list.add(n);
        return indexOf(arr,n+1,list,target);

    }
    public static int[] indexof(int arr[],int target,int n,int count){
        if(n==arr.length)
            return new int[count];
        if(arr[n]==target)
            count++;
        int array[]=indexof(arr,target,n+1,count);
        if(arr[n]==target)
            array[count-1]=n;
        return array;
    }
}

package RecursionClass;

import java.util.ArrayList;

public class Total_Seqeunce_sum {

    public static void main(String[] args) {
          int arr[]={10,20,30,40,50};
          int target=60;
//          Sequence_sum(arr,arr.length,0,0,target,"");
          printsubsequenceSum(arr,0,"",0,target);
    }
    public static void Sequence_sum(int arr[],int n,int sum,int i,int target,String ans){
        if(i==n && sum!=target)
            return;

        if(sum==target){
            System.out.println(ans);
            return;
         }

        for (int j = i; j < n; j++) {
            Sequence_sum(arr,n,sum+arr[j],j+1,target,ans+arr[j]+", ");
        }
    }

    public static void printsubsequenceSum(int arr[],int idx,String set,int sum,int target){
        if(idx==arr.length){
            if(sum==target){
                System.out.println(set);
            }
            return;
        }
        printsubsequenceSum(arr,idx+1,set+arr[idx]+",",sum+arr[idx],target);
        printsubsequenceSum(arr,idx+1,set,sum,target);
    }
}

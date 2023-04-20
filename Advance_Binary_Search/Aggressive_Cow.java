package Advance_Binary_Search;

import java.util.Arrays;

public class Aggressive_Cow {
    public static void main(String[] args) {
        int arr[]={1,4,2,8,9};
        int noc=3;
        Arrays.sort(arr);
        int i=0;
        int j=arr[arr.length-1];
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(ispossible(arr,noc,mid)==true){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        System.out.println(ans);
    }

    public static boolean ispossible(int arr[],int noc,int distance){
        int pos=arr[0];
        int cc=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-pos>=distance){
                pos=arr[i];
                cc++;
            }
            if(cc==noc){
                return true;
            }
        }

        return false;
    }
}

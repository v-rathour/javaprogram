import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner obj=new Scanner(System.in);
      int t=obj.nextInt();
      while(t-->0){
          int n=obj.nextInt();
          int m=obj.nextInt();
          int arr[]=new int [n];
          for(int i=0;i<arr.length;i++){
              arr[i]=obj.nextInt();

          }
          
          int sum=0;
          for(int i=0;i<arr.length;i++){
              sum +=arr[i];
          }

          int i=0;
          int j=sum;
          int ans=0;
          while(i<=j){
              int mid=i+(j-i)/2;
              if(ispossible(arr,m,mid)==true){
                    ans=mid;
                    j=mid-1;
              }
              else{
                  i=mid+1;
              }
          }

          System.out.println(ans);
        }
    }

    public static boolean ispossible(int arr[],int no_stu,int target){
        
        int page=0;
        int stu=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                return false;
            }
            if(arr[i]+page<=target){
                page=arr[i]+page;
            }
            else{
                page=arr[i];
                stu++;
            }

            if(stu>no_stu){
                 return false;
            }
        }

        return true;
    }
}

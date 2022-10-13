public class Kth_Root_google {
    public static void main(String[] args) {
        int n=47;
        int k=3;
        System.out.println(Kthroot(n,k));

    }
    public static int Kthroot(int n,int k){
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
}

public class kartik_bhaiya_And_String {
    public static void main(String[] args) {
        String str="abba";
        int k=2;
        int flipa=MaximumArray(str,k,'a');
        int flipb=MaximumArray(str,k,'b');
        System.out.println(Math.max(flipa,flipb));
    }
    public static int MaximumArray(String str ,int k,char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while (ei<str.length()){
            // window grow
            if(str.charAt(ei)==ch)
                flip++;
            while(flip>k && si<=ei){
                if(str.charAt(si)==ch)
                    flip--;
                si++;
            }

            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}

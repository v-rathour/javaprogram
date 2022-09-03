public class PractiseClass {
    public static void main(String args[]) {
        long arr[] = {9,8,7,6,5,4,3,2,1,0};
        int i = 0;
        long sum = 0;
        while (i < arr.length) {
            sum = sum * 10 + arr[i];
            i++;
        }
        sum += 1;
        i = 0;
        long copy = sum;
        while (copy != 0) {
            i++;
            copy /= 10;
        }
        long rev;
        long arr1[] = new long[i];
        i -= 1;
        while (sum != 0) {
            rev = sum % 10;
            arr1[i] = rev;
            sum /= 10;
            i--;
        }
        for(long j:arr1)
        {
            System.out.print(j+" ");
        }
    }

}

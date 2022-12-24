import java.util.*;
public class intersection_of_two_Array {
    public static void main(String[] args) {
        int []nums1 = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int[] arr=intersection(nums1,nums2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] primitive = list.stream().mapToInt(Integer::intValue).toArray();
        return primitive;
    }
}

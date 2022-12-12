public class Strings_Max_Frequency_Character {
    public static void main(String[] args) {
        String str="aaabacb";
        System.out.println((char)Frequency(str));
    }
    public static int Frequency(String str){
        int arr[]=new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        int max=0;
        for (int i = 1; i < 26; i++) {
            if(arr[i-1]<arr[i]){
                max=i;
            }
        }
        return max+'a';
    }
}

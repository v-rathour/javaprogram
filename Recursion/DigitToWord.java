package RecursionClass;

public class DigitToWord {
    public static void main(String[] args) {
        int n=321;
         PrintWord(n);
    }
    public static void PrintWord(int num){
        if(num==0){
            return ;
        }
        PrintWord(num/10);
        int n=num%10;

        switch(n){
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }

    }
}

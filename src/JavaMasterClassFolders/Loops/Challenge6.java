package JavaMasterClassFolders.Loops;

public class Challenge6 {
    public static boolean isPolindrome(int number){
        int reverse = 0;
        int original = number;
        while(number>0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        } 
        return reverse == original; 
    }
    public static void main(String[] args) {
        System.out.println(isPolindrome(122));
        System.out.println(isPolindrome(12321));
    }
}

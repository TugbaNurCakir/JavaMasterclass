package JavaMasterClassFolders.Loops;

public class Challenge7 {
    private static int sumFirstandLastDigit(int number){
        if(number<0){
            return -1;
        }
        int lastDigit = number % 10;
        while(number>9){
            number /=10;
        }
        return lastDigit + number;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstandLastDigit(123));
    }
}

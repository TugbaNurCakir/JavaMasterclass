package JavaMasterClassFolders.Loops;

public class Challenge9 {
    private static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return false;
        }
        return (number1%10==number2%10)||(number1/10==number2/10)||(number1%10==number2/10)||(number1/10==number2%10);
    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}

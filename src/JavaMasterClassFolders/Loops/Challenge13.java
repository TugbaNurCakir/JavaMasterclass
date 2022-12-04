package JavaMasterClassFolders.Loops;

public class Challenge13 {
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sumOfDivisors=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sumOfDivisors+=i;
            }
            
        }
        return number == sumOfDivisors;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }
}

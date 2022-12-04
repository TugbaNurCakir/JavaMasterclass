package JavaMasterClassFolders.Loops;

public class Challenge12 {
    private static void printFactors(int num){
        if(num<1){
            System.out.println("Invalid value.");
        }
        String factors = "";
        for(int i=1; i<=num; i++){
            if(num%i==0){
                factors+=i+" ";
            }
        }
        System.out.println(factors);
    }
    public static void main(String[] args) {
        printFactors(6);
    }
}

package JavaMasterClassFolders.Loops;

public class Challenge1 {    
    public static void main(String[] args) {
        
        for(int i=2; i<9; i++){
            System.out.println("10,000 at "+ i +"% interest = "+ (1000.0*i));
        }
        int count = 0;
        for(int i =10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i+ " is a prime number. and count is "+count);
                if(count==3){
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }
    }
    
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
package JavaMasterClassFolders.OperatorPrecedenceChallenge;

public class Operators {
    public static void main(String[] args) {
        double myFirstDoubleValue  = 20.00;
        double mySecondDoubleValue = 80.00;
        double result = (myFirstDoubleValue + mySecondDoubleValue) * 100.00;
        double remainderOfResult = result % 40.00;
        boolean isNoRemainder =  (remainderOfResult==0.0) ? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Go some remainder");
        }
       }
}

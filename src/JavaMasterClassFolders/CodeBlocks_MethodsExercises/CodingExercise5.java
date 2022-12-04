package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise5 {
    //  DecimalComparator
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        return (int) (number1*1000) == (int) (number2*1000);
    }
    public static void main(String[] args) {
        boolean isFlag = areEqualByThreeDecimalPlaces(-3.100, 3.100);
        System.out.println("Result: "+ isFlag);
    }
}   

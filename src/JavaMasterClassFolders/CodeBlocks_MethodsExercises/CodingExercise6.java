package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise6 {
    //Equal Sum Checker
    public static boolean hasEqualSum(int num1, int num2, int result){
        if(num1+num2==result){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean isEqualSum = CodingExercise6.hasEqualSum(2, 3, 6);
        System.out.println("Result: "+isEqualSum);
        isEqualSum = hasEqualSum(2, 3, 5);
        System.out.println("Result: "+isEqualSum);
        isEqualSum = hasEqualSum(-1, 1, 0);
        System.out.println("Result: "+isEqualSum);
    }
}
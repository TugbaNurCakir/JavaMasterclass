package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise7 {
    //Teen Number Checker
    public static boolean hasTeen(int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen(int num){
        return (num>=13 && num<=19);
    }
    public static void main(String[] args) {
        boolean hasTeenResult = hasTeen(9, 99, 19);
        System.out.println(hasTeenResult);
        hasTeenResult = hasTeen(23, 15, 42);
        System.out.println(hasTeenResult);
        hasTeenResult = hasTeen(22, 23, 34);
        System.out.println(hasTeenResult);
    }
}
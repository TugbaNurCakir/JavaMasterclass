package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise {

    public static void checkNumber(int number){
        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-22);
        checkNumber(0);
        checkNumber(5412);
    }
}

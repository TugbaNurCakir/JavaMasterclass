package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise3 {
    //Barking Dog 
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking==false || hourOfDay<0 || hourOfDay>23 || (hourOfDay>7 && hourOfDay<23)){ //before 8 or after 23 //the dog is barking at night.
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean result = shouldWakeUp(true, 1);
        System.out.println(result);
        result = shouldWakeUp(false, 2);
        System.out.println(result);
        result = shouldWakeUp(true, 8);
        System.out.println(result);
        result = shouldWakeUp(true, -1);
        System.out.println(result);
    }
}

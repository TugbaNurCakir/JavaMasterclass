package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise11 {
    //Playing Cat

    public static boolean isCatPlaying(boolean summer, int temperature) {       
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
    //long version
    /*
     * public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        }
        else if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        }
        return false;
    }
     */

    public static void main(String[] args) {
        boolean hasCatPlaying = isCatPlaying(true, 10);
        System.out.println(hasCatPlaying);
        hasCatPlaying = isCatPlaying(false, 36);
        System.out.println(hasCatPlaying);
        hasCatPlaying = isCatPlaying(false, 35);
        System.out.println(hasCatPlaying);
    }
}

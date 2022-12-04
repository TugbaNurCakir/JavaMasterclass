package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise9 {
    //Minutes to Years and Days Calculator

    public static void printYearsAndYears(long minutes){
        if(minutes<0){
            System.out.println("Invalid value.");
        }
        else{
            long years =minutes / 525600 ;
            long days = minutes / 1440 ;
            long daysLeft = days % 365;
            System.out.println(minutes+" min = "+years+" y and "+daysLeft+" d");
        }
    } 

    public static void main(String[] args) {
        printYearsAndYears(525600);
        printYearsAndYears(1051200);
        printYearsAndYears(561600);
    }
}

package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

//Speed Converter Exercise
public class CodingExercise1 {

public static long toMilesPerHour(double kilometeresPerHour){
    if(kilometeresPerHour<0){
        return -1;
    }
    return Math.round(kilometeresPerHour/1.609);
}
public static void printConversion(double kilometeresPerHour){
    if(kilometeresPerHour<0){
        System.out.println("Invalid value");
    }else{
        System.out.println(kilometeresPerHour+" km/h = "+toMilesPerHour(kilometeresPerHour)+" mi/h");
    }
}
     public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}

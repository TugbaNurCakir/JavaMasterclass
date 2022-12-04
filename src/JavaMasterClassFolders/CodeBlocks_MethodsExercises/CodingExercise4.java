package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise4 {
    //Leap Year Calculator
    public static boolean islLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year %4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean isFlag = islLeapYear(-1600);
        System.out.println("Result:" + isFlag);
        isFlag = islLeapYear(2000);
        System.out.println("Result1:" + isFlag);
        isFlag = islLeapYear(2400);
        System.out.println("Result2:" + isFlag);
        isFlag = islLeapYear(1600);
        System.out.println("Result3:" + isFlag);
    }
     
}

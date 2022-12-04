package JavaMasterClassFolders.MethodOverloading;

public class Exercise1 {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || (inches<0 || inches>12)){
            System.out.println("Invalid value.");
            return -1;
        }
        double cm = (feet * 30.48) + (inches * 2.54);
        System.out.println(feet + " feet " + inches + " inches = " + cm + " cm.");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            System.out.println("Invalid value.");
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(1, -5);
        calcFeetAndInchesToCentimeters(12);
        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(13, 1);
    }
}

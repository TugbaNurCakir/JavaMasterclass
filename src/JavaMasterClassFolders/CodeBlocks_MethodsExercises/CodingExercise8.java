package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class CodingExercise8 {
    //Area Calculator
    public static double area(double radius){
        return (radius<0) ? -1 : radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        return  (x<0 || y<0) ? -1 : x * y;
    }
    public static void main(String[] args) {
        double areaResult = area(5.0);
        System.out.println("result: "+areaResult);
        areaResult = area(-1);
        System.out.println("result: "+areaResult);
        areaResult = area(5.0, 4.0);
        System.out.println("result: "+areaResult);
        areaResult = area(-1.0, 4.0);
        System.out.println("result: "+areaResult);
    }
}

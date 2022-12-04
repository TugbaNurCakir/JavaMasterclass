package Java_book_practices.OOP.Ornek1.Ornek2;

public class Square extends Rectangle{
    private double side;

    @Override
    public double calcArea(double a, double b){
        return side*side;
    }

    @Override
    public double calcPerimeter(double a, double b){
        return 2*(side+side);
    }

}
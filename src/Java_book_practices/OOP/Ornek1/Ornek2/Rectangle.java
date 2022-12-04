package Java_book_practices.OOP.Ornek1.Ornek2;

public class Rectangle extends Shape{
    private double side1;
    private double side2;

    @Override
    public double calcArea(double a, double b){
        return side1*side2;
    }

    @Override
    public double calcPerimeter(double a, double b){
        return 2*(side1+side2);
    }
}
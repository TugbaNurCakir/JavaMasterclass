package Java_book_practices.OOP.Ornek1.Ornek2;

public class Circle extends Shape{
    private int radius;
    private double pi = Math.PI;
    @Override
    public double calcArea(double a, double b){
        return (radius*radius)*pi;
    }

    @Override
    public double calcPerimeter(double a, double b){
        return pi*Math.sqrt(radius);
    }

    public String getRadius() {
        return null;
    }
}
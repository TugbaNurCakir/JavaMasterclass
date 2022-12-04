package Java_book_practices.OOP.Ornek5;

public class Triangle implements Calculator{
    double side = 10;
    double high = 2;

    @Override
    public double calcArea() {
        // TODO Auto-generated method stub
        return (side*high)/2;
    }

    @Override
    public double calcPerimeter() {
        // TODO Auto-generated method stub
        return 3*side;
    }
    
}

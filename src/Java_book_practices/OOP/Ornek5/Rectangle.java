package Java_book_practices.OOP.Ornek5;

public class Rectangle implements Calculator{

    double side1;
    double side2;

    @Override
    public double calcArea() {
        // TODO Auto-generated method stub
        return side1*side2;
    }

    @Override
    public double calcPerimeter() {
        // TODO Auto-generated method stub
        return 2*(side1+side2);
    }
    
}

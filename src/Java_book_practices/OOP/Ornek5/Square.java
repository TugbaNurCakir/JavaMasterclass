package Java_book_practices.OOP.Ornek5;

public class Square implements Calculator{
    double side1;

    @Override
    public double calcArea() {
        // TODO Auto-generated method stub
        return Math.sqrt(side1);
    }

    @Override
    public double calcPerimeter() {
        // TODO Auto-generated method stub
        return 2*(Math.sqrt(side1));
    }
    
}

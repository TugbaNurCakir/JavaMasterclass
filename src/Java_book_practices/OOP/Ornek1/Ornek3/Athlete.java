package Java_book_practices.OOP.Ornek1.Ornek3;

public abstract class Athlete {
    private double salary;
    private int orderOfSuccess;
    private String club;

    public Athlete(){
        System.out.println("This class name is Athlete");
    }

    abstract public void showClass();
    
    public void takeInfo(double salary, int orderOfSuccess, String club){
        this.salary = salary;
        this.orderOfSuccess = orderOfSuccess;
        this.club = club;
    }

    public void printInfo(){
        System.out.println("Salary: "+ salary + "\n Order of Success: "+ orderOfSuccess + "\n Club: "+ club);
    }
}

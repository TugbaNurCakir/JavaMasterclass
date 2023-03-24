package Java_book_practices.OOP.Ornek7;

public class Car {
    private int wheel;
    private String brand;
    private double km;

    public void printInfo(){
        System.out.println("Car Class");
    }

    public int getWheel() {
        return wheel;
    }
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }

    
}

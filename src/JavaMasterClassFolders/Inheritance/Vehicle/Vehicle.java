package JavaMasterClassFolders.Inheritance.Vehicle;

public class Vehicle {
    private String name;
    private String size;
    private int speed;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
    }
    
    public void move(int speed){
        this.speed = speed;
        System.out.println("Vehicle moving at "+ speed);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }
    public void stop(){
        this.speed = 0;
    }
}

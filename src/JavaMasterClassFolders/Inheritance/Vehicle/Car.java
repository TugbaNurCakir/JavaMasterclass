package JavaMasterClassFolders.Inheritance.Vehicle;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors,int gears) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
    
    @Override
    public void move(int speed) {
        // TODO Auto-generated method stub
        System.out.println("Car moving");
    }

    public int getGears() {
        return gears;
    }
    
    public void changeGear(int currentGear){
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeVelocity(int speed){
        move(speed);
        System.out.println("Car.changeVelocity");
    }
}

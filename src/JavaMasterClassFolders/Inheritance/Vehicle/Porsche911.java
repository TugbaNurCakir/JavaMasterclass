package JavaMasterClassFolders.Inheritance.Vehicle;

public class Porsche911 extends Car{
    private int roadServiceMonths;

    public Porsche911(int roadServiceMonths) {
        super("Porsche911", "4WD", 4, 2, 6);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getSpeed()+rate;
        if(newVelocity==0){
            stop();
        }else if(newVelocity>0 && newVelocity<=10){
            changeGear(1);
        }else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }else if(newVelocity>20 && newVelocity<=30){
            changeGear(3);
        }else{
            changeGear(4);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity);
        }
    }

    @Override
    public void move(int speed) {
        // TODO Auto-generated method stub
        System.out.println("Porsche911 moving");
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }
    
}

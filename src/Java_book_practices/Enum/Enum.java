package Java_book_practices.Enum;

public class Enum {
    enum Cars{
        AUDI("blue", 100), MERCEDES("black", 200), BMW("red", 180);
       public String color;
       public int speed;

       Cars(String color, int speed) {
        this.color = color;
        this.speed=speed;
        }

        int getSpeed(){
            return speed;
        }
/* 
        AUDI(), MERCEDES(), BMW();
        public String color;
        public int speed;

*/
        
        
    }
    public static void main(String[] args) {

        System.out.println(Cars.AUDI);//AUDI
        System.out.println(Cars.BMW.ordinal()); //2 // ordinal gives indis value of BMW.
        System.out.println(Cars.MERCEDES);
}
}

package Java_book_practices.Enum;

public class Enum {
    enum Cars{
        AUDI, MERCEDES, BMW;
       public String color;
       public int speed;
/* 
        AUDI("purple", 220), MERCEDES("red", 230), BMW("blue", 240);
        public String color;
        public int speed;

        Cars(String color, int speed) {
        this.color = color;
        this.speed=speed;
        }

*/
        
        
    }
    public static void main(String[] args) {

        System.out.println(Cars.AUDI);
}
}

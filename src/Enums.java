enum Animals {
    CAT(110), DOG(120), SNAKE(130), RABBIT(140);
    public int speed;
    Animals(int speed){ //enum içerisindeki constructorlar public olamazlar ve enumlar inherit edilemezler.
        this.speed = speed;
    }
}

public class Enums{
    public static void main(String[] args) {
        //System.out.println(Animals.CAT.speed);
        for (Animals a : Animals.values()) {
            System.out.println(a.name()+" ");
            System.out.println(a.speed);
        }
        System.out.println(Animals.CAT.ordinal()); //indis değerini dönderir.
    }
}

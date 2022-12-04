package Java_book_practices.OOP.Ornek1;

import Java_book_practices.OOP.Ornek1.Ornek3.BasketballPlayer;
import Java_book_practices.OOP.Ornek1.Ornek3.VolleyballPlayer;
import Java_book_practices.OOP.Ornek4.Music;
import Java_book_practices.OOP.Ornek5.Triangle;

public class Main {
    public static void main(String[] args) {

        //ornek1
        Food food = new Food("bread", 10.9, "Baked Product", 1.05);
        food.printClassName();
        System.out.println(food.calculateVAT());
        System.out.println(food);

        //ornek3
        VolleyballPlayer vPlayer = new VolleyballPlayer();
        BasketballPlayer bPlayer = new BasketballPlayer();
        vPlayer.showClass();
        bPlayer.showClass();

        //ornek4
        Music music = new Music(2);
        music.quantity();

        //ornek5
        Triangle triangle = new Triangle();
        
        //Ornek6
        
    }
}

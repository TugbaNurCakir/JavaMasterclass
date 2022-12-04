import java.util.Random;
import java.util.Scanner;

public class JOptionPane_exmpl {
    public static void main(String[] args) {  
        Random r = new Random(10);
        int randomNum = r.nextInt(10);
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a number: ");
           int userInput = input.nextInt();
           if(randomNum<userInput){
               System.out.println("Please enter a number than smaller your input.");
           }
           else if(randomNum>userInput){
               System.out.println("Please enter a number than bigger your input.");
           }
           else{
               System.out.println("Congratulations!!! Your input is correct answer.!!! The number was "+randomNum);
               break;
           }
        }
        input.close();
    }
}
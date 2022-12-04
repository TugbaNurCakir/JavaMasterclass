package Projects.NumberGuessingGame;

import javax.swing.JOptionPane;

public class GuessingGame{

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100+1);
        System.out.println("The correct guess would be " + randomNumber);
        Integer userAnswer = 0;
        int counter=1;
        int round=1;
        int score = 0;
        
            while(userAnswer!=randomNumber &&  !userAnswer.equals(null)){
                String response = JOptionPane.showInputDialog(null,
                "Enter a number guess between 1 and 100", "Guessing Game", 3);
                try {
                    userAnswer = Integer.parseInt(response);
                } catch (NumberFormatException e) {
                   e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, determineGuess(userAnswer, randomNumber, counter, round, score));
                counter++;
                if(counter>10){
                    JOptionPane.showMessageDialog(null, "You passed 10 attempts. Try again later.");
                    round++;
                    if(round>=3){
                        JOptionPane.showMessageDialog(null, "You passed 3 rounds. Try again later.");
                        break;
                    }
                   
                }
            }
    }

    public static String determineGuess(int userAnswer, int randomNumber, int counter, int round, int score){
        if(userAnswer>100 || userAnswer<=0){
            return"Invalid answer. Please enter a number between 1 and 100!!";
        }
        else if (userAnswer == randomNumber ){
            if(round==1){
                score=100;
            }
            else if(round==2){
                score=90;
            }
            else if(round==3){
                score=80;
            }
            return "Correct!\nTotal Guesses: " + counter + " Round: " +round +" Score: " +score;
        }
        else if (userAnswer > randomNumber) {
            return "Your guess is too high, try again.\nTry Number: " + counter+ " Round: " +round +" Score: " +score;
        }
        else if (userAnswer < randomNumber) {
            return "Your guess is too low, try again.\nTry Number: " + counter+ " Round: " +round +" Score: " +score;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + counter+ "Round: " +round;
        }
    }
}
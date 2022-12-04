package JavaMasterClassFolders.CodeBlocks_MethodsExercises;

public class Code_Blocks_Conditions {
    public static void main(String[] args) {
        calculateScore();

        int scorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tugba", scorePosition);

        scorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Eray", scorePosition);

        scorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Mustafa", scorePosition);

        scorePosition = calculateHighScorePosition(5);
        displayHighScorePosition("Kemal", scorePosition);

        scorePosition = calculateHighScorePosition(11111111);
        displayHighScorePosition("Alp", scorePosition);
       
    }
    public static int calculateScore(){
        int score = 5000;
        int levelCompleted = 8;
        int bonus = 100;
        boolean gameOver= false;

        int finalScore = score + (bonus * levelCompleted);    
        if(gameOver){
            System.out.println("Your final score was "+ finalScore);
            return finalScore;
        }
        return -1;
    }
    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName+" managed to get into position "+position+" on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore>=1000){
            position = 1;
        }
        else if(playerScore>=500){
            position = 2;
        }
        else if(playerScore>=100){
            position = 3;
        }
        return position;
    }
}

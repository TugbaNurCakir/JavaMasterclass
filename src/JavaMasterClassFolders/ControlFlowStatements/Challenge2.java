package JavaMasterClassFolders.ControlFlowStatements;

public class Challenge2 {
    private static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4: 
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("Invalid number");
                break;     
        }
        /*
         * String word;
 
    switch (number){
        case 0 :
           word = "ZERO";
           break;
        case 1 :
           word = "ONE";
           break;
        case 2 :
           word = "TWO";
           break;
        case 3 :
            word = "THREE";
            break;
        case 4 :
            word = "FOUR";
            break;
        case 5 :
            word = "FIVE";
            break;
        case 6 :
            word = "SIX";
            break;
        case 7 :
            word = "SEVEN";
            break;
        case 8 :
            word = "EIGHT";
            break;
        case 9:
            word = "NINE";
            break;
        default:
            word = "OTHER";
            break;
    }
 
    System.out.println(word);
         */
    }
    public static void main(String[] args) {
        printNumberInWord(7);
    }
}

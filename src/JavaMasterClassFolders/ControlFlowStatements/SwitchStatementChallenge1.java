package JavaMasterClassFolders.ControlFlowStatements;

public class SwitchStatementChallenge1 {
    private static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        if(day==0){
            System.out.println("Sunday");
        }
        else if (day==1){
            System.out.println("Monday");
        }
        else if (day==2){
            System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }
        else if (day==5){
            System.out.println("Friday");
        }
        else if (day==6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Invalid day");
        }
    }
    public static void main(String[] args) {
        char letter = 'i';
        switch (letter) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(letter);
                break;
            default:
                System.out.println("Was not A, B, C, D or E");
                break;
        }

        int month = 7;
        switch(month){
            case 12: case 1: case 2:
                System.out.println("The season is Winter.");
                break;
            case 3: case 4: case 5: 
                System.out.println("The season is Spring");
                break;
            case 6: case 7: case 8: 
                System.out.println("The season is Summer");
                break;
            case 9: case 10: case 11: 
                System.out.println("The season is Autumn");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        printDayOfTheWeek(6);
    }
    
}

package JavaMasterClassFolders.Loops;

public class Challenge4 {
    private static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static void main(String[] args) {

        int startNumber = 4;
        int finishNumber = 20;
        int totalNumber = 0;
        while(startNumber<=finishNumber){
            startNumber++;
            if(!isEven(startNumber)){
                continue;
            }
            totalNumber++;
            if(totalNumber>=5){
                break;
            }
            
            System.out.println(startNumber + " is a even number and");
        }
        System.out.println("there are "+ totalNumber+ " number between 4 and 20");

/* 
        System.out.println(isEven(5));
        System.out.println(isEven(0));
        System.out.println(isEven(-1));
        System.out.println(isEven(10)); */
    }
}

package JavaMasterClassFolders.ControlFlowStatements;

public class Challenge3 {
    private static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }
        else
            return (year%4==0) && (year%100!=0) || (year%400==0);
    }

    private static int getDaysInMonth(int month, int year){
        if((month<1 || month>12)||(month<1 || month>9999)){
            return -1;
        }
        if(month==2 && isLeapYear(year)){
            return 29;
        }
        switch(month){
            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2: 
                return 28;
            default:
                return 31;
        }
    }   
    public static void main(String[] args) {
        isLeapYear(2012);
        System.out.println(getDaysInMonth(2, 2018));    
    }
}

package JavaMasterClassFolders.MethodOverloading;

public class Exercise2 {
    private final static String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(long minutes, long seconds){
        if(minutes<0 || (seconds<0 || seconds>59)){
            return INVALID_VALUE_MESSAGE;
        }
        long remainingMinutes = minutes % 60;
        long hours = minutes / 60;

        String hoursString = hours + " h "; 
        if(hours<10){
            hoursString = " 0 "+ hoursString;
        }

        String minutesString = remainingMinutes + " m "; 
        if(remainingMinutes<10){
            minutesString = " 0 "+ minutesString;
        }

        String secondsString = seconds + " s "; 
        if(seconds<10){
            secondsString = " 0 "+ secondsString;
        }
        return hoursString +  minutesString + secondsString;
    }
    public static String getDurationString(long seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        getDurationString(minutes, remainingSeconds);
        return getDurationString(minutes, remainingSeconds);

    }
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
       System.out.println(getDurationString(65, 45));
    }
}
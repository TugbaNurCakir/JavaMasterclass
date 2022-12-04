package JavaMasterClassFolders.ParsingValues;

public class Challenge1 {
    //bigCount=5 kilos each
    //smallCount = 1 kilo each
    private static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(bigCount*5>goal){
            return false;
        }
        if((bigCount*5)+(smallCount*1)>=goal){
            return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        System.out.println(canPack(2, 0, 9));
        System.out.println(canPack(1, 5, 9));
        System.out.println(canPack(3, 0, 19));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(-3, 2, 12));
    }
}

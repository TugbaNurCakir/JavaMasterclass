package JavaMasterClassFolders.Loops;

public class Challenge11 {
    private static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 42));
    }
}

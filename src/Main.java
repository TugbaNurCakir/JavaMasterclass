public class Main {
    public static void main(String[] args) {
        int[][] jaggArr = new int[3][]; //3 adet tam sayı dizisi saklayan prüüzli bir dizi tanımlaması.
        int[] arr1 = {1, 2};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {6, 7, 8, 9};

        jaggArr[0] = arr1;
        jaggArr[1] = arr2;
        jaggArr[2] = arr3;

        System.out.println(jaggArr[0][0]); //1
  }
}

//Title: Program to find and print the greatest number in an array.
package ArrayFiles;

public class Array1 {
    public static int GreatestNumber(int[] arr) {
        int g = 0;
        for (int j : arr) {
            if (j > g) {
                g = j;
            }
        }
        return g;
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 3, 6, 8};
        int a = GreatestNumber(arr);
        System.out.println("The greatest number in the array is: " + a);
    }
}

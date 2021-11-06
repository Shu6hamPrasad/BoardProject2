//Title: Finding a given integer in an array using Linear Search Algorithm.

package ArrayFiles;

import java.util.Scanner;

public class Array2 {
    public static int LS(int[] arr, int tgt) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tgt) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find: ");
        int x = sc.nextInt();
        int[] arr = {12, 45, 23, 67, 34};
        int out = LS(arr, x);
        if (out == -1) System.out.println("Element not found");
        else System.out.println("Element found at index: " + out);
    }
}

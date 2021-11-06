//Title: Pascal's Triangle

package NestedLoopFiles;

public class NestedLoop1 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++, x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

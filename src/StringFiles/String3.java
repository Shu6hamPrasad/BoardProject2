//Title: Program to reverse a String given by a user

package StringFiles;

import java.util.Scanner;

public class String3 {
    public static String reverse(String s) {
        StringBuilder out = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            out.append(s.charAt(i));
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("The reverse is: " + reverse(s));
    }
}

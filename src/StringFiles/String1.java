//Title: Program to remove every vowel from a sentence given by a user.

package StringFiles;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' &&
                    s.charAt(i) != 'i' && s.charAt(i) != 'o' &&
                    s.charAt(i) != 'u' && s.charAt(i) != 'A' &&
                    s.charAt(i) != 'E' && s.charAt(i) != 'I' &&
                    s.charAt(i) != 'O' && s.charAt(i) != 'U') {
                out.append(s.charAt(i));
            }
        }

        System.out.println(out);
    }
}

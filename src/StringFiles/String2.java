//Title: Program to convert every Upper Case letter to a Lower Case letter and vice
//versa of a Sentence given by the user.

package StringFiles;

import java.util.Scanner;

public class String2 {

    public static String CaseChanger(String s) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                c = (char) (s.charAt(i) + 32);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                c = (char) (s.charAt(i) - 32);
            } else {
                c = s.charAt(i);
            }

            out.append(c);
        }

        return out.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("The modified string is: " + CaseChanger(s));
    }
}

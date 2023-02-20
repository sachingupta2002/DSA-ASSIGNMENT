/*Recursively remove all adjacent duplicates: Given a string of characters, recursively
remove adjacent duplicate characters from the string. The output string should not
have any adjacent duplicates.
*/
package assignment;

import java.util.Scanner;

public class ques_2 {
    private static String removeDuplicates(String s,
                                           char ch)
    {


        if (s == null || s.length() <= 1) {         //if length is 0 or 1
            return s;
        }

        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length()
                    && s.charAt(i) == s.charAt(i + 1)) {
                int j = i;
                while (j + 1 < s.length()
                        && s.charAt(j) == s.charAt(j + 1)) {
                    j++;
                }
                char lastChar
                        = i > 0 ? s.charAt(i - 1) : ch;

                String remStr = removeDuplicates(
                        s.substring(j + 1, s.length()),
                        lastChar);

                s = s.substring(0, i);
                int k = s.length(), l = 0;

                // Recursively remove all the adjacent
                // characters formed by removing the adjacent chaaracters

                while (remStr.length() > 0 && s.length() > 0
                        && remStr.charAt(0)
                        == s.charAt(s.length() - 1)) {

                    // Have to check whether this is the
                    // repeated character that matches the
                    // last char of the parent String
                    while (remStr.length() > 0
                            && remStr.charAt(0) != ch
                            && remStr.charAt(0)
                            == s.charAt(s.length()
                            - 1)) {
                        remStr = remStr.substring(
                                1, remStr.length());
                    }
                    s = s.substring(0, s.length() - 1);
                }
                s = s + remStr;
                i = j;
            }
            else {
                i++;
            }
        }
        return s;
    }
    //start of the maian function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s=sc.nextLine();
        System.out.println(removeDuplicates(s,' '));
    }
}

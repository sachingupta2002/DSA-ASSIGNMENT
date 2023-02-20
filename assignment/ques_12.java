/*Given an array of characters formed with a’s and b’s. The string is marked with
special character X which represents the middle of the list (for example:
ababa…ababXbabab….baaaa). Check whether the string is palindrome.
*/
package assignment;
import java.util.*;
public class ques_12 {
    //function for checking if the string is palindrome or not
    static String hey(String s)
    {
        char[]b=s.toCharArray();
        for(int i=0;i<b.length/2;i++)
        {
            if(b[i]!=b[b.length-i-1]){
                return "no";
            }
        }
        return "yes";
    }
    //start of the main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for which you want to check");
        String s=sc.nextLine();
        System.out.println(hey(s));

    }
}

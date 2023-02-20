/*Given array[] with sliding window of size w which is moving from the very left of the
array to very right. Assume that we can only see the w numbers in the window. Each
time the sliding window moves right forwards by on position*/
package assignment;
import java.util.*;
public class ques_17 {
    //function for printing max elements in every window of size w
    static void print_max(int[]arr,int w) {
        int max = 0;
        for (int i = 0; i < arr.length- w + 1; i++) {
            max = arr[i];
            for (int j = i + 1; j < i + w; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.println(max);

        }
    }

    //start of the main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of thr array you want");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter window size");
        int w= s.nextInt();
        print_max(arr,w);

        }
}




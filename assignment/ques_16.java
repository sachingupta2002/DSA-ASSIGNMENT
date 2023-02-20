/*Given a stack of integers, how do you check whether each successive pair of members
in the stack is consecutive or not. The pairs can be increasing or decreasing, and if the
stack has an odd number of elements, the element at the top is left out of pair. For
example, if stack of elements are [4, 5, -2, -3, 11, 10, 5, 6, 20], then the output should
be true because each of the pairs (4,5), (-2,-3), (11,10) and (5,6) consists of
consecutive numbers.
*/

package assignment;
import java.util.Stack;
import java.util.Scanner;
public class ques_16 {
    //function to check the given condition in the question
    static boolean check(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return false;
        }
        while(!s.isEmpty())
        {
            int k=s.pop();
            int m=s.pop();
            if(Math.abs(k-m)!=1)
            {
                return false;
            }
        }
        return true;
    }
    //start of the main function
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the stack");
        int n= s.nextInt();
        System.out.println("Enter your elements");
        for(int i=0;i<n;i++)
        {
            stack.push(s.nextInt());
        }
        if(n%2!=0)
        {
            stack.pop();
        }
        System.out.println(check(stack));

    }

}

/*Show how to implement one stack efficiently using two queues. Analyse the running
time of stack operations.
*/
package assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ques_15 {
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();
    public void push(int n)
    {
        q1.add(n);  //push operation
                    //Time complexity O(1)
    }
    public int pop()
    {
        while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        int y=q1.remove();
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());        //pop operation
                                        //Time complexity O(n^2)
        }
        return y;
    }

    public static void main(String[] args) {        //main function
        ques_15 stack= new ques_15();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements you want");
        int n=s.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++) {
           stack.push(s.nextInt());
        }
          for(int i=0;i<n;i++)
          {
              System.out.println(stack.pop());
          }
    }
}

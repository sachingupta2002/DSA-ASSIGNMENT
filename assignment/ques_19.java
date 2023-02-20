/*. Given an integer k and a queue of integers, how do you reverse the order of first k
elements of the queue, leaving the other elements in the same relative order? For
example, if k=4 and queue have the elements [10, 20, 30, 40, 50, 60, 70, 80, 90]; the
output should be [40, 30, 20, 10, 50, 60, 70, 80, 90].*/

package assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;       //imported packages of java util framework
import java.util.Stack;

public class ques_19 {
    //function for performing the given task
    static Queue<Integer> rev(  Queue<Integer> w,int k)
    {
      int z=k;
      Stack<Integer> hey= new Stack<>();
      Queue<Integer> hey2= new LinkedList<>();
      while(k>0)
      {
          hey.add(w.remove());
          k--;
      }
      while(z>0)
      {
          hey2.add(hey.pop());
          z--;
      }
      while (!w.isEmpty())
      {
          hey2.add(w.remove());
      }
      return hey2;
    }
    //start of the main function
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements you want");
        int n=sc.nextInt();
        System.out.println("Enter your elements");
        for(int j=0;j<n;j++)
        {
            q.add(sc.nextInt());
        }
        System.out.println("Enter size of window you want to reverse ");
        int k= s.nextInt();
        System.out.println(q);
        q=rev(q,k);
        System.out.println(q);
    }
}

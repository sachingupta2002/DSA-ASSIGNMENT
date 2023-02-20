/*Given an array of elements, replace every element with nearest greater element on the
  right of that element.*/
package assignment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ques_1
{       //solving this question using stack
        //TIME COMPLEXITY FOR THIS O(N)
    public static int[]throurgh_stack(int[]c)
    {
        Stack<Integer> hey= new Stack<>();
        for(int i=c.length-1;i>=0;i--)
        {
            hey.push(c[i]);
        }
        int[]a=new int[c.length];
        int count=0;
        int i=0;
        while(i<c.length)
        {

          int u= hey.pop();
          a[i]=u;
          for(int j=i+1;j<c.length;j++)
          {
              if(u<c[j])
              {
                  a[i]=c[j];
                  break;
              }
          }
        if(u==a[i])
        {
            a[i]=-1;
        }
            i++;
        }
    return a;
    }
    //start of the main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY YOU WANT");
        int n=s.nextInt();
        System.out.println("ENTER ARRAY ELEMENTS");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int[]a= new int[arr.length];
        int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++) {
            count = 0;      //time complexity big oh(n^2) maybe we can optimise using this problem stack data structure //
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    a[k++] = arr[j];
                    count++;
                    break;
                }
            }
            if (count == 0) {
                    a[k++] = -1;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(throurgh_stack(arr)));
    }
}

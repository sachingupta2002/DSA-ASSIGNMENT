/*Given an array of n numbers, create an algorithm which displays all pairs whose sum
is S. */
package assignment;

import java.util.Scanner;

public class ques_6 {
    static void print_pairs(int[]arr,int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    System.out.print("("+arr[i]+","+arr[j]+")");
                }
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array you want");
        int n=s.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the sum for which you want pairs");
        int k=s.nextInt();
        print_pairs(arr,k);

    }
}

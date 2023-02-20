/*. Given a list, List1={A1,A2,A3,……..An-1, An} with data, reorder it to {A1, An, A2, An1, …..} without using any extra space. */
package assignment;
import java.util.Arrays;
import java.util.*;
public class ques_3 {
    //function for  modifying the array in-place
    static int[]a(int[]arr)
    {
        int m=arr.length-1;
        for(int i=1;i<arr.length;i=i+2)
        {
            int temp=arr[m];
            for(int j=arr.length-1;j>i;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[i]=temp;

        }
        return arr;
    }
    //driver code
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array you want");
        int n =sc.nextInt();
        int[]a= new int[n];
        System.out.println("Enter array elements");
        for(int x=0;x<n;x++)
        {
            a[x]=sc.nextInt();
        }

        System.out.println(Arrays.toString(a(a)));
    }
}

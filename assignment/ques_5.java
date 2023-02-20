/* [Find the modular node from the end:] Given a singly linked list, write a function
to find the first from the end whose n%k==0, where n is the number of elements in the
list and k is an integer constant. If n=19 and k=3 then we should return 16th node.
*/
package assignment;

import java.util.Scanner;

public class ques_5 {


 Node head;
    int size = 0;

    class Node {
        int data;
   Node next;

        public Node(int n) {
            this.data = n;
        }
    }

    public void insert_head(int n) {
       Node node = new Node(n);
        node.next = head;
        head = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int modular_node(int k)   //function for finding modular node
    {
        Node temp=head;
        int val=0;
        int i=1;
        int count=0;
        while(temp!=null)
        {
            if(i%k==0)
            {
                count=1;
                val=temp.data;
            }
            i++;
            temp=temp.next;
        }
        if(count==0)
        {
            return -1;
        }
        return val;
    }
    //start of the main function
    public static void main(String[] args) {
        ques_5 n= new ques_5();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements you want");
        int n1=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n1;i++)
        {
            n.insert_head(sc.nextInt());
        }
        n.display();
        int k= sc.nextInt();
        System.out.println("The modular node is");
        System.out.println(n.modular_node(k));
    }

}
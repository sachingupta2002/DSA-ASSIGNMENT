/*For a given k value (k>0) reverse blocks of nodes in the list.
 Example: Input: 1,2,3,4,5,6,7,8,9,10
 Output for different k values: For k=2: 2,1,4,3,6,5,8,7,10,9
 For k=3: 3,2,1,6,5,4,9,8,7,10 For k=4: 4,3,2,1,8,7,6,5,9,10

 */
package assignment;

import java.util.Scanner;

public class ques_9 {
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
        }
    }
    public void insert_head(int n)
    {
        Node node= new Node(n);
        node.next=head;
        head=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    Node reverse(Node head, int k)
    {
        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. */
        if (next != null)
            head.next = reverse(next, k);

        // prev is now head of input list
        return prev;
    }

    //start of the main function
    public static void main(String[] args) {
        ques_9 n = new ques_9();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements you want");
        int n1=sc.nextInt();
        System.out.println("Enter your elemnts");
        for(int i=0;i<n1;i++)
        {
            n.insert_head(sc.nextInt());
        }
      System.out.println("The original list is");
        n.display();
        System.out.println("Enter window size you want to reverse");
        int k= sc.nextInt();
        System.out.println("The reversed list is");
        n.head= n.reverse(n.head,k);   //returning it to the head pointer
        n.display();
    }
}

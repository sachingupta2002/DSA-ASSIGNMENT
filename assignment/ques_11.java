/* Check whether the given linked list is either NULL-terminated or ends in cycle
(cyclic).
*/
package assignment;

import java.util.Scanner;

public class ques_11 {
   Node head;
    int size=0;
    static class Node{
        int data;
       Node next;
        public Node(int n)
        {
            this.data=n;
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

        public boolean hasCycle(Node head) {        //function for detecting the cycle
            Node fast=head;
            Node slow=head;
            if(head==null)
            {
                return false;
            }
            else{
                while(fast!=null&&fast.next!=null)
                {
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    //start of the main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN YOUR  FIRST LINKEDLIST");
        int n1 = s.nextInt();
        ques_11 b = new ques_11();
        System.out.println("Enter the elements");
        for (int i = 0; i < n1; i++) {
            b.insert_head(s.nextInt());
        }
        b.head.next.next.next.next = b.head;  //create a loop for  testing.....
        System.out.println(b.hasCycle(b.head));
    }
    }




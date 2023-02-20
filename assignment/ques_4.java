/*Given a singly linked list, write a function to find root(n)th element, where n is the
        number of elements in the list. Assume value of n is not known in advance.*/
        package assignment;
import java.util.*;
public class ques_4 {
    Node head;
    int size=0;
 class Node{
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

    public int root()
    {
       Node temp=head;
       int n=0;
       while(temp!=null)
       {
           n++;
           temp=temp.next;
       }
       temp=head;
       double x=Math.sqrt((double)n);
       int y=(int)x;
       int i=1;
      while(i<x)
       {
           temp=temp.next;
           i++;

       }
      return temp.data;

    }

    //start of the main function
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN YOUR LINKEDLIST");
        int n=s.nextInt();
        ques_4 a= new ques_4();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a.insert_head(s.nextInt());
        }
        System.out.println("THE ROOT ELEMENT IS");
        System.out.println(a.root());
    }

}

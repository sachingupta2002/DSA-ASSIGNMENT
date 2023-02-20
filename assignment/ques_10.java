/*. Suppose there are two singly linked lists both of which intersect at some point and
become a singly list. The head or starting pointers for the both lists are known, but the
intersecting node is not known. Also the number of nodes in each of the lists before
they intersect is unknown and may be different in each list. List1 may have n nodes
before it reaches the intersection point, and list2 might have m nodes before it reaches
the intersection point where m and n may be m=n, m<n or m>n. write a program for
find a merging node.
*/
package assignment;
import java.sql.SQLOutput;
import java.util.*;
public class ques_10 {

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

    public Node getIntersectionNode(Node headA, Node headB) {   //function to get  intersection node
        Node temp1 = headA;
        Node temp2 = headB;
        Set<Node> h = new HashSet<>();
        while (temp1 != null) {
            h.add(temp1);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            if (h.contains(temp2)) {
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN YOUR  FIRST LINKEDLIST");
        int n = s.nextInt();
        ques_10 a = new ques_10();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a.insert_head(s.nextInt());
        }

        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT IN YOUR  SECOND LINKEDLIST");
        int n1 = s.nextInt();
        ques_10 b = new ques_10();
        System.out.println("Enter the elements");
        for (int i = 0; i < n1; i++) {
            a.insert_head(s.nextInt());
        }

        System.out.println("THE INTERSECTION NODE IS");
        System.out.println(a.getIntersectionNode(a.head,b.head));
    }
}
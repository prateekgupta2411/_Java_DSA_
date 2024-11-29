package day22_linkedlist;
import java.util.LinkedList;
public class ClassRoom {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer>  ll =new LinkedList<>();
        // Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        // Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}

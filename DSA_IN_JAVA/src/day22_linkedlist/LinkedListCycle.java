package day22_ll;

public class LinkedListCycle {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle() { // Floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        // Fast pointer moves two steps, slow pointer moves one step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast point to the same node, there is a cycle
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // no cycle
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
            if(cycle == false){
                return;
        }

        // find meeting point
        slow = head;
            Node prev = null; // last node
            while (slow!=fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;  //  1->2->3->2

        System.out.println(isCycle()); // This will print true if the cycle exists, otherwise false
        removeCycle();
        System.out.println(isCycle());
    }
}


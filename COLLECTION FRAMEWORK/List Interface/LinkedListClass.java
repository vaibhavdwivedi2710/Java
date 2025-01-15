import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        //multi ended list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(5);
        linkedList.addLast(6);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.contains(6);
    }
}
/* A LinkedList is a data structure in Java, part of the java.util package, that stores elements in a
sequential chain of nodes, where each node contains the element and a reference to the next(and optionally
previous) node. It allows efficient insertion and deletion but slower access compared to ArrayList.
 */


/*An ArrayList is backed by a dynamic array, providing fast random access to elements but slower insertions
and deletions due to the need for resizing and shifting elements. In contrast, a LinkedList is implemented 
as a doubly-linked list, enabling efficient insertions and deletions at any position but with slower random 
access because elements are accessed sequentially by traversing the nodes.
 */

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
     //LIFO - Last in First Out
     Stack<Integer>st = new Stack<>();
     st.push(2);
     st.push(4);
     st.push(6);
     System.out.println(st);
     System.out.println(st.peek());
     st.pop();
     System.out.println(st);
     System.out.println(st.peek());
     System.out.println(st.isEmpty());
    }
    /*A stack is a linear data structure that follows the Last In, First Out (LIFO) principle, where the
    last element added is the first to be removed. It supports two primary operations: push (to add
    an element) and pop (to remove the top element), along with peek to view the top element without 
    removing it.
     */
}

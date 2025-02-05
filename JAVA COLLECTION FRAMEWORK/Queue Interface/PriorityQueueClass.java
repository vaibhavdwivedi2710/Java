import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        //DS that stores elements and whenever you ask for peek() or poll() it will give you the smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.offer(7);
        pq.offer(3);
       // System.out.println(pq);
        // System.out.println(pq.peek());
        // pq.poll();
        // System.out.println(pq.peek());
        while(pq.isEmpty()==false) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}

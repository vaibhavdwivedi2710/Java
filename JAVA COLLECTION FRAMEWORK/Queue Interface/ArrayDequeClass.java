import java.util.ArrayDeque;
public class ArrayDequeClass {
   
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        //FIFO
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        System.out.println(ad);
        //peek() returns the head of the queue because it is a FIFO
        System.out.println(ad.peek());
        ad.poll(); //take out first entered element
        System.out.println(ad);
        System.out.println(ad.peek());
    }
}

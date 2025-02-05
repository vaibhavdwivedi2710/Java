import java.util.*;
//Custom Comparator code for getting max heap of a priority queue
public class CustomComparator3 {

    public static Comparator<Integer>geComparator(){
        return new Comparator<Integer>(){
            //[num1, num2]
            @Override
            public int compare(Integer num1, Integer num2){
                //num1<num2
                //order is wrong
                if(num1<num2){
                    return 1;
                }
                else if(num1>num2){
                    return -1;
                }
                return 0;
            }
        };
    }

    public static void main(String[] args) {
            // this is of max heap in priority queue - Max heap
            PriorityQueue<Integer> pq = new PriorityQueue<>(geComparator());
            pq.add(1);
            pq.add(4);
            pq.add(6);
            System.out.println(pq.poll());
    }
}

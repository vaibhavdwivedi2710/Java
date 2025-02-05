import java.util.*;

public class CommonAlgorithms {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);

        // for sorting the list
        Collections.sort(al);
        // for sorting in reverse order
        Collections.sort(al, Collections.reverseOrder());
        //for min element in the list
        Collections.min(al);
        //for max element in the list
        Collections.max(al);
        //for reversing the list
        Collections.reverse(al);
        //for frequency of element in the list
        Collections.frequency(al, 1);

        //binary search
        //Collections.binarySearch(list, key);

        //mathematical operations
        Math.pow(2, 3); //2^3

        double num = Math.pow(2,3 );
        System.out.println(num);
        //output - 8.0
    }
}

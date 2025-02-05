import java.util.TreeMap;
import java.util.Set;
//DS that stores elements in sorted order
//Almost similar to HashMap
// Problem is in time complexity of TreeMap is more than HashMap, (O(logn) for TreeMap and O(1) for HashMap)

public class TreeMapClass {
    public static void main(String[] args) {
        // TreeMap<Integer, String> tm = new TreeMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.floorKey(2);  //returns the key less than or equal to the given key
        tm.ceilingKey(2); //returns the key greater than or equal to the given key
        Set<Integer> keys = tm.keySet();
    }
}


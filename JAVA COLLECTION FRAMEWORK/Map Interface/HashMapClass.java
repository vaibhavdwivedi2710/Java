import java.util.HashMap;

// HashMap is a class that implements Map interface
// It stores the data in key-value pair
// It doesn't allow duplicate keys but allows duplicate values
// Duplicate keys will overwrite the existing value
// Dynamically increases the size of the map
public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Vaibhav");
        hm.put(2, "Reliance");
        hm.put(3, "Jio");
        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.size());
        hm.remove(2);
        System.out.println(hm);
    }
}

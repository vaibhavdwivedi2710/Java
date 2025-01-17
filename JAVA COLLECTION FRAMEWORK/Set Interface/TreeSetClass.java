import java.util.TreeSet;

public class TreeSetClass {
   public static void main(String[] args) {
    //DS that stores unique elements in sorted order
    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(12);
    ts.add(9);
    ts.add(1);
    ts.add(4);
    // for(var num : ts){
    //  System.out.println(num);
    // }
    System.out.println(ts);
    System.out.println(ts.floor(8)); //print first value lesser than or equal to 8
    System.out.println(ts.ceiling(8)); // print first value greater than equal to 8
    
   }
   // TC for treeset is (logN) where N is size of TreeSet
   // TC for hashset is O(1)
}

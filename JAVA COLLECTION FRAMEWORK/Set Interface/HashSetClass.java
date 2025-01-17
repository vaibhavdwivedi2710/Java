import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
       //DS that stores unique elements in any random order
       HashSet<Integer> hs = new HashSet<>();
       hs.add(1);
       hs.add(2);
       hs.add(1);
       hs.add(0);
       System.out.println(hs);
       // doesn't give you guarantee for sorted order
       //hs.remove(2);
       System.out.println(hs);
       for(Integer num:hs){
        System.out.println(num);
       }
       //var automatically aussume hashset type
       for(var num: hs){
        System.out.println(num);
       }
    }
}

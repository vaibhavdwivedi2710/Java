import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface { 
    public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    
    // for(var num: al){
    //     System.out.println(num);
    // }
    Iterator<Integer> it = al.iterator();
    while(it.hasNext()){
        Integer num = it.next();
        System.out.println(num);
    }
    //output - 1 5 4
    
    List<Integer> al2 = new ArrayList<>(); //can also be written as List<Integer> al2 = new ArrayList<>();
  }
    
}

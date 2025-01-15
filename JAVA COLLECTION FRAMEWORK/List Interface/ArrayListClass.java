import java.util.ArrayList;

//Array List is class in java which is implementing List interface
public class ArrayListClass {

    public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(10);
      arrayList.add(20);
      arrayList.add(30);
      arrayList.add(40);
      System.out.println(arrayList);
      System.out.println(arrayList.size());
      System.out.println(arrayList.get(3));
      //System.out.println(arrayList.remove(2));
      arrayList.add(1,17);
      System.out.println(arrayList.contains(18));
    }
  
}
/*An ArrayList is a resizable, ordered collection in Java, part of the java.util package,
that allows dynamic addition and removal of elements. Unlike arrays, its size can grow or shrink as needed,
and it supports generic types for type safety.*/

/*
1. Dynamic Sizing: Automatically resizes when elements are added or removed, unlike fixed-size arrays.
2. Indexed Access: Supports random access to elements using indices, similar to arrays.
3. Generic Support: Allows type-specific elements using generics, reducing runtime errors.
4. Performance: Fast for retrieval (O(1)) but slower for insertion/removal at arbitrary positions (O(n)).
5. Part of Java Collections: Implements List interface, providing methods like add(), remove(), get(), and size().
 */


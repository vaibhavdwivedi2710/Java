import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());
        //capcity tells us the size of vector
    }

}
/*Vector is a synchronized, dynamic array that can grow or shrink in size as needed. It allows storing
duplicate elements and provides thread-safe operations, making it suitable for concurrent environments,
although it is less commonly used compared to ArrayList due to performance considerations.*/

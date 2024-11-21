import java.util.Scanner;

//print sum of all array elements
public class ArrayQuestion1 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
      int [] arr = new int[size];
      int x;
      for(x=0;x<(size);x++){
        arr[x]= scanner.nextInt();
      }
      scanner.close();
      int sum=0;
      for(x=0;x<(size);x++){
        sum = sum+arr[x];
      }
      System.out.println(sum);
   }
}

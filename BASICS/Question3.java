import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
       // you need to take n numbers and then you have to print 
       // sum of these numbers
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       int [] arr = new int[size];
       int i;
       for(i=0; i<=size-1;i++){
        arr[i]=scanner.nextInt();
       }
       int sum =0;
       for(i=0;i<=size-1;i++){
        sum = sum +arr[i];
       }
       System.out.println(sum);

       //for each loop
       for(int num:arr){
        System.out.println(num +" ");
       }
       scanner.close();

    }
}

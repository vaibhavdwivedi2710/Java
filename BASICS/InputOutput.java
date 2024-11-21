import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter Number: ");
     int num = scanner.nextInt();
     System.out.println("You have Entered: " + num);

     String firstName = scanner.next();
     String lastName = scanner.next();
     System.out.println(firstName+" "+lastName); // example vaibhav dwivedi
     scanner.close();

     ////Why Not BufferReader
    }
}

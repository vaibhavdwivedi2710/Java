import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        //Given an age,print "adult" if age>=19 or print "Teen"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Teen");
        }
        scanner.close();
    }
}

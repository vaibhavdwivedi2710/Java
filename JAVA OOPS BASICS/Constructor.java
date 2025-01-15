// default constructor with bank example


// class Test{
//   public Test(){
//     System.out.println("default Constructor called");
//   }
//   public void printHello(){
//     System.out.println("Hello");
//   }
// }
class BankAccount{
  double balance;
  public BankAccount(){
    balance = 100.0;
  }
  public void printBalance(){
    System.out.println(balance);
  }
} 

public class Constructor {
    public static void main(String[] args) {
        //Test test = new Test();
        //test.printHello();
        BankAccount bankAccount = new BankAccount();
        bankAccount.printBalance();
    }
}

/*In simple terms, a constructor is a special method in Java that is called automatically when an object 
of a class is created. Its job is to initialize the object's fields (attributes) to the values you provide
or to default values.*/

/*1.Default Constructor - A constructor that doesn’t take any parameters. If you don’t explicitly write any
constructor, Java automatically provides a default constructor that initializes the object with default values
 (e.g., null for objects, 0 for numbers).

 Purpose: To initialize the object with default values.

Example: Think of it like buying a pre-built computer with standard specifications. You don't choose any 
custom components; you just get the default setup.*/

/*2. Parameterized Constructor - A constructor that takes arguments (parameters) to allow you to initialize the object with 
specific values when you create it.

Purpose: To create objects with different initial values by passing data when creating the object.

Example: Imagine you are custom-building a computer by selecting specific components like brand, RAM, etc.
You provide all the necessary details when ordering.*/

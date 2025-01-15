// Encapsulation (Getter and Setter)
class BankAccount{
  private double balance;
  public BankAccount( double balance){
    this.balance = balance;
  }

  //Creating Getter and Setter
  public void setBalance( double balance){
    this.balance = balance;
  }

  public double getBalance(double balance){
    return balance;
  }

  public void printBalance(){
    System.out.println(balance);
  }

}
public class Encapsulation {
    public static void main(String[] args) {
      BankAccount person1 = new BankAccount(200.0);
      //person1.setBalance(900.0); 
      // we can still modify but there must be soome logic written/access
      person1.printBalance();
    }
}

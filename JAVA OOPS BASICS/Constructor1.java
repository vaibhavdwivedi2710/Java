class BankAccount{
    private double balance;
    private String accountType;
    // parameter constructor 
    public BankAccount(double balance){
       this.balance = balance;
       this.accountType = "Saving";
    }
    public BankAccount(double balance , String accountType){
       this.balance = balance;
       this.accountType = accountType;
    }
    public void printBalance(){
        System.out.println(balance);
    }
    public void printAccountType(){
        System.out.println(accountType);
    }
}
public class Constructor1 {
    public static void main(String[] args) {

        BankAccount person1 = new BankAccount(200);
        person1.printBalance();
        person1.printAccountType();

        BankAccount person2 = new BankAccount(1000,"Current");
        person2.printBalance();
        person2.printAccountType();
        
        //why encapsulation comes into exist become no one allow you to change it
        // person1.balance=0.0;
        // System.out.println(person1.balance);
    }
}

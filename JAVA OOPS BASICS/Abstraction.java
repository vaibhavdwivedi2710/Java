abstract class BankAccount {
    double balance;
    //abstract method
    abstract void addMoney(double amount);
    abstract void canUserWithdrawMoney(double amount);
    
    //non abstract method
    void updateBalance( double balance){
       this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
}

class SavingAccount extends BankAccount{
   public void addMoney(double amount){
    super.updateBalance(super.getBalance()+amount);
   }
   public void canUserWithdrawMoney(double amount){
    if(amount<= super.getBalance()){
        System.out.println("User Can");
    }
    else{
        System.out.println("User Cannot");
    }
   }
    
}

class CurrentAccount extends BankAccount{
    double minimumLimit = 1000;

    public void addMoney(double amount){
    super.updateBalance(super.getBalance()+amount);
    }

    public void canUserWithdrawMoney(double amount){
    if(super.getBalance()-amount>=minimumLimit){
        System.out.println("User Can");
    }
    else{
        System.out.println("User Cannot");
    }
    }
    
}
class Basics {
public static void main(String[] args) {
    
}

//we can not create object of abstract class
    
}


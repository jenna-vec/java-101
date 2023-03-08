public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  //check balance
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  //deposit
  public void deposit(int amountToDeposit) {
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }

  //withdraw
  public int withdraw(int amountToWithdraw) {
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }

  //toString
  public String toString() {
    return "Your balance is " + balance;
  }
  
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //checkBalance
    savings.checkBalance();
    
    //deposit
    savings.deposit(300);

    //withdraw
    savings.withdraw(50);

    //toString
    System.out.println(savings);
    
  }       
}

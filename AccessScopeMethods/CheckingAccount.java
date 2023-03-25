package AccessScopeMethods;

public class CheckingAccount{
  private String id;
  private int balance;
  private double interestRate;

  public CheckingAccount(String inputId, int inputBalance){
    this.id = inputId;
    this.balance = inputBalance;
    this.interestRate = 0.02;
  }

  //getBalance() and calculateNextMonthInterest() are private but the info is called in a public method
  public void getAccountInformation(){
    System.out.println("Money in account: " + this.getBalance());
    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

  }

  private int getBalance(){
    return this.balance;
  }

  private double calculateNextMonthInterest(){
    return this.interestRate * this.balance;
  }

}

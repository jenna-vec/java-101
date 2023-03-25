package AccessScopeMethods;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    this.accountOne = new CheckingAccount("1", 100);
    this.accountTwo = new CheckingAccount("2", 200);
  }

  public static void main(String[] args){
    Bank ourBank = new Bank();
    ourBank.accountOne.getAccountInformation();
      /*
      * Money in account: 100
      * Next Month's Interest: 2.0
      * If ourBank.accountOne.calculateNextMonthInterest(); is called it will produce an error.
      * .calculateNextMonthInterest() is a private method.
      */
  }

}

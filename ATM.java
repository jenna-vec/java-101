public class ATM {
  
  // Static variables
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variable
  public int money;

  //contsructor method
  public ATM(int inputMoney){
    this.money = inputMoney;
    //changes to the static variables
    numATMs += 1;
    totalMoney += inputMoney;
  }

  //object variable & static variable mutator method
  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      totalMoney -= amountToWithdraw;
    }
  }

  //static method
  public static void averageMoney(){
    System.out.println("The average ATM holds: $" + totalMoney / numATMs);
  }

  //main method
  public static void main(String[] args){

    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);

    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);

    System.out.println(numATMs + " ATMs have a total of $" + totalMoney);
    System.out.println("ATM #1 has $" + firstATM.money);
    System.out.println("ATM #2 has $" + secondATM.money);
    
    // Static methods are called by the class (ATM)
    ATM.averageMoney();
  }

}

/*
* 2 ATMs have a total of $800
* ATM #1 has $500
* ATM #2 has $300
* The average ATM holds: $400
*/

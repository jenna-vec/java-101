package AccessScopeMethods;

public class CheckingAccount {
    //instance variables, all private
    private String name;
    private int balance;
    private int id;

    //Contstructor
    public CheckingAccount(String inputName, int inputBalance, int inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    //accessor method
    public int getBalance() {
        return balance;
    }

    //mutator method
    public void setBalance(int newBalance){
        balance = newBalance;
    }
}

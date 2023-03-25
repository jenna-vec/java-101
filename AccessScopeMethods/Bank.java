package AccessScopeMethods;

public class Bank {
    //instance variables accessing CheckingAccount constructor
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    //constructor accessing CheckingAccount
    public Bank() {
        accountOne = new CheckingAccount("Zeus", 100, 1);
        accountTwo = new CheckingAccount("Hades", 200, 2);
    }

    //main method
    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setBalance(500);
        System.out.println(bankOfGods.accountOne.getBalance());
    }

}

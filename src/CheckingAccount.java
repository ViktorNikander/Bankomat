public class CheckingAccount extends Account{

    public CheckingAccount(double balance, double interestRate, Customer accountHolder, Employee accountManager) {
        super(balance, interestRate, accountHolder, accountManager);
    }

    @Override
    public void setBalance(int balance) {
        super.setBalance(balance);
    }
}

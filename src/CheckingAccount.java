public class CheckingAccount extends Account{

    public CheckingAccount(double balance, double interestRate, Customer accountHolder, Employee accountManager) {
        super(balance, interestRate, accountHolder, accountManager);
    }

    @Override
    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= getBalance()){
            super.withdrawal(withdrawalAmount);
        } else {
            System.out.println(deniedWithdrawal());
        }
    }
}

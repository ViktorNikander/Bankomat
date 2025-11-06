public class CheckingAccount extends Account{

    public CheckingAccount(int accountNumber,double balance, double interestRate, Customer accountHolder, Employee accountManager) {
        super(accountNumber,balance, interestRate, accountHolder, accountManager);
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

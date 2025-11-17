package Accounts;

import Person.Customer;
import Person.Employee;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(double balance, double interestRate, Customer accountHolder, Employee accountManager, double creditLimit) {
        super(balance, interestRate, accountHolder, accountManager);
        this.creditLimit = -creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdrawal(double withdrawalAmount) {
        if ((getBalance() - withdrawalAmount) >= creditLimit){
            super.withdrawal(withdrawalAmount);
        } else {
            System.out.println(deniedWithdrawal());
        }
    }
}

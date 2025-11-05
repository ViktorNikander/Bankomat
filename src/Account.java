import java.util.List;

public abstract class Account {
    private double balance;
    private double interestRate;
    private Customer accountHolder;
    private Employee accountManager;
    private List<AccountHistory> accountHistoryList;

    public Account(double balance, double interestRate, Customer accountHolder, Employee accountManager) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountHolder = accountHolder;
        this.accountManager = accountManager;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Employee getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(Employee accountManager) {
        this.accountManager = accountManager;
    }

    public List<AccountHistory> getAccountHistoryList() {
        return accountHistoryList;
    }

    public void setAccountHistoryList(List<AccountHistory> accountHistoryList) {
        this.accountHistoryList = accountHistoryList;
    }
}

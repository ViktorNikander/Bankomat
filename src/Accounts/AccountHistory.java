package Accounts;

import Person.Employee;

import java.time.LocalDateTime;

public class AccountHistory {
    private LocalDateTime timestamp;
    private double balanceBefore;
    private double balanceAfter;
    private double interestBefore;
    private double interestAfter;
    private Employee authorizedByEmployee;

    public AccountHistory(LocalDateTime timestamp, double balanceBefore, double balanceAfter, double interestBefore, double interestAfter, Employee authorizedByEmployee) {
        this.timestamp = timestamp;
        this.balanceBefore = balanceBefore;
        this.balanceAfter = balanceAfter;
        this.interestBefore = interestBefore;
        this.interestAfter = interestAfter;
        this.authorizedByEmployee = authorizedByEmployee;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getBalanceBefore() {
        return balanceBefore;
    }

    public void setBalanceBefore(double balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public double getInterestBefore() {
        return interestBefore;
    }

    public void setInterestBefore(double interestBefore) {
        this.interestBefore = interestBefore;
    }

    public double getInterestAfter() {
        return interestAfter;
    }

    public void setInterestAfter(double interestAfter) {
        this.interestAfter = interestAfter;
    }

    public Employee getAuthorizedByEmployee() {
        return authorizedByEmployee;
    }

    public void setAuthorizedByEmployee(Employee authorizedByEmployee) {
        this.authorizedByEmployee = authorizedByEmployee;
    }
}

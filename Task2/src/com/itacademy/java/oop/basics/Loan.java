package com.itacademy.java.oop.basics;

public class Loan {

    private int id;
    private int amount;
    private LoanType loanType;
    private String terminationDate;

    public Loan() {

    }

    public Loan(int id, int amount, LoanType loanType, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public String getTerminationDate() {
        return terminationDate;
    }
}

package com.itacademy.java.oop.basics;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private long personalNumber;
    private Loan[] loans;

    public Customer() {

    }

    public Customer(String name, String surname, int age, long personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public long getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getLoan() {
        return loans;
    }

    void printCustomerInformation(){
        System.out.println(name + " " + surname + ", " + age + " ID: " + personalNumber + " has loans: ");
        int amount = 0;
        for (Loan loan : loans) {
            amount += loan.getAmount();
            System.out.println(loan.getLoanType().getDisplayValue());
        }
        System.out.println("Total amount of loan is " + amount);
    }
}

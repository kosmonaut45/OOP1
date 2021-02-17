package com.itacademy.java.oop.basics;

public class AccountApplication {

    public static void main(String[] args) {
        Account firstAccount = new Account("1", "Savings", 100);
        Account secondAccount = new Account("2", "Daily", 50);

        firstAccount.credit(20);
        firstAccount.credit(10);
        System.out.println(firstAccount.getBalance());
        secondAccount.credit(10);
        System.out.println(secondAccount.getBalance());
        firstAccount.debit(500);
        secondAccount.transferTo(firstAccount, 70);
        firstAccount.debit(30);
        System.out.println(firstAccount.getBalance());
        firstAccount.transferTo(secondAccount, 10);
        System.out.println(firstAccount.getBalance());
        System.out.println(secondAccount.getBalance());
        System.out.println(firstAccount.toString());
        System.out.println(secondAccount.toString());
    }

}

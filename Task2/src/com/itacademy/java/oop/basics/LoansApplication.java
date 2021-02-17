package com.itacademy.java.oop.basics;

public class LoansApplication {

    public static void main(String[] args) {

        Loan[] loans = new Loan[2];
        loans[0] = new Loan(1, 200000, LoanType.CONSUMER, "2023-12-31");
        loans[1] = new Loan(2, 78000, LoanType.LEASING, "2022-06-30");

        Customer customer = new Customer("Džonis", "Banderas", 79, 34908176057L, loans);

        customer.printCustomerInformation();
    }
}

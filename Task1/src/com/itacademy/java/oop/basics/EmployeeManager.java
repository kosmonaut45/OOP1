package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {

        Employee jonas = new Employee("Jonas", "Eskobaras", ContractType.PART_TIME, "2020-08-01", 1500, "Supervidor");

        jonas.printEmployeeInformation();

    }
}

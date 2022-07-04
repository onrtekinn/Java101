package oop;

import java.util.Scanner;

public class Association {
    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);

        Bank bank =new Bank("Bank of ....");
        Employee employee=new Employee("Name Surname");

        System.out.println(employee.getEmployeeName()+"is employee of"+bank.getBankName());
    }
}

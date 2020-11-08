package com.lectures.lecture05;

public class javaActions {
    public static void main(String[] args){
        Employee employee = new Employee(); // create new object in the class Employee
        employee.setEmployeeName("Ivan");  // with Get and Set we can use the info from another class
        employee.employeeSalary();

        System.out.println("salary from getter before method:" + employee.getSalary());

        String str = "This is my \"first\" string: %d";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.replace("my", "your"));
        System.out.println(String.format(str, 6));

        String[] stringParts = str.split(" ");
        String firstPart = stringParts[2];
        System.out.println(stringParts[2]);

    }
}

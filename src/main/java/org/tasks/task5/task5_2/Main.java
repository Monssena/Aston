package org.tasks.task5.task5_2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        List<Employee> employeeList = company.addEmployeeList();

        System.out.println("New list of employees:");
        employeeList.forEach(System.out::println);

        System.out.println("\nEmployees over 30:");
        company.getEmployeesOlderThan30(employeeList).forEach(System.out::println);

        System.out.println("\nNumber of employees:");
        System.out.println(company.countEmployees(employeeList));

        System.out.println("\nThe employee with the maximum salary:");
        System.out.println(company.getEmployeeWithMaxSalary(employeeList));

        System.out.println("\nHR employees:");
        company.getHRNamesSorted(employeeList).forEach(System.out::println);

        System.out.println("\nAverage salary:");
        System.out.println(company.getAverageSalary(employeeList));

    }
}

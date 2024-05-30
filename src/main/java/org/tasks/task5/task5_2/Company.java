package org.tasks.task5.task5_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Company {

    public List<Employee> addEmployeeList() {

        return Stream.of(
                new Employee("John Doe", 32, "IT", 60000),
                new Employee("Jane Smith", 28, "HR", 50000),
                new Employee("Alice Brown", 45, "IT", 75000),
                new Employee("Bob White", 38, "HR", 45000)
        ).toList();
    }

    public List<Employee> getEmployeesOlderThan30(List<Employee> employees) {

        return employees.stream().filter(employee -> employee.getAge() > 30).
                sorted(Comparator.comparing(Employee::getAge)).toList();
    }

    public long countEmployees(List<Employee> employees) {

        return employees.stream().count();
    }

    public Employee getEmployeeWithMaxSalary(List<Employee> employees) {

        return employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
    }

    public List<Employee> getHRNamesSorted(List<Employee> employees) {

        return employees.stream().filter(employee -> employee.getDepartment().equals("HR"))
                .sorted(Comparator.comparing(Employee::getName)).toList();
    }

    public double getAverageSalary(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).average().getAsDouble();
    }
}

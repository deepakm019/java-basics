package test;

import object.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryWithinRange {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Bob", 70000),
                new Employee("Alice", 80000)
        );

        int minSalary = 60000;
        int maxSalary = 75000;

        List<String> namesInRange = employees.stream()
                .filter(e -> e.getSalary() >= minSalary && e.getSalary() <= maxSalary)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(namesInRange);

    }
}

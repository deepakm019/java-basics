package test;

import object.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Bob", 70000),
                new Employee("Alice", 80000)
        );

        double avgSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();

        List<String> highSalaryNames = employees.stream()
                .filter(e -> e.getSalary() > avgSalary)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(highSalaryNames);
    }


}

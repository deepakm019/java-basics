package test;

import object.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryGreaterThanMaxSalaryOfMale {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000, "male"),
                new Employee("Jane", 60000, "female"),
                new Employee("Bob", 70000, "male"),
                new Employee("Alice", 80000, "female")
        );

        double maxMaleSalary = employees.stream()
                .filter(e -> e.getGender().equals("male"))
                .mapToDouble(Employee::getSalary)
                .max()
                .getAsDouble();

        List<String> highSalaryNames = employees.stream()
                .filter(e -> e.getSalary() > maxMaleSalary)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(highSalaryNames);
    }
}

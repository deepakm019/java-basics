package test;

import object.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryWithAge {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000, 25),
                new Employee("Jane", 60000, 35),
                new Employee("Bob", 70000, 45),
                new Employee("Alice", 80000, 30)
        );

        List<String> highSalaryNames = employees.stream()
                .filter(e -> e.getSalary() > 50000 && e.getAge() > 30)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(highSalaryNames);
    }
}

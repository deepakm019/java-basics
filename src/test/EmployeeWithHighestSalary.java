package test;

import object.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeWithHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Bob", 70000),
                new Employee("Alice", 80000)
        );

        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println(highestSalaryEmployee.getName());

    }
}

package test;

import object.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeAverageSalaryForFemale {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000, "male"),
                new Employee("Jane", 60000, "female"),
                new Employee("Bob", 70000, "male"),
                new Employee("Alice", 80000, "female")
        );

        double avgFemaleSalary = employees.stream()
                .filter(e -> e.getGender().equals("female"))
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();

        System.out.println(avgFemaleSalary);
    }


}

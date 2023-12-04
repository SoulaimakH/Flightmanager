package io.camunda.example;

import java.util.List;

public class Employee {
    private List<Long> employeeId;
    private List<String> firstName;
    private List<String> lastName;
    private List<Integer> VacDays;

    // Constructors (default and parameterized)

    public Employee() {
    }

    public Employee(List<String> firstName, List<String> lastName, List<Integer> VacDays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.VacDays = VacDays;
    }

    // Getters and setters

    public List<Long> getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(List<Long> employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(List<String> firstName) {
        this.firstName = firstName;
    }

    public List<String> getLastName() {
        return lastName;
    }

    public void setLastName(List<String> lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getVacDays() {
        return VacDays;
    }

    public void setVacDays(List<Integer> VacDays) {
        this.VacDays = VacDays;
    }

    // toString method for debugging or logging

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", VacDays=" + VacDays +
                '}';
    }
}

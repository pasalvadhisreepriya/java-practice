package com.nestedclasses;

public class Employee {
    private int empID;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int empID, String name, int yearStarted) {
        this.empID = empID;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", yearStarted=" + yearStarted +
                '}';
    }
}

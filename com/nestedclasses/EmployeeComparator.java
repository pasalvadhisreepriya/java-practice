package com.nestedclasses;

import java.util.Comparator;

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

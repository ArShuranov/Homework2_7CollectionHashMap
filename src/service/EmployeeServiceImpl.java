package service;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<String, Employee> baseOfEmployees = new HashMap<>(Map.of(
            "1", new Employee("Иван", "Иванович", "Иванов", 1, 20),
            "2", new Employee("Иван", "Иванович", "Иванов", 1, 20),
            "3", new Employee("Иван", "Иванович", "Иванов", 1, 20)));

    public Map<String, Employee> getBaseOfEmployees() {
        return baseOfEmployees;
    }

    public void addEmployee(Map map) {
        baseOfEmployees.put("Иванов", new Employee("Иван", "Иванович", "Иванов", 1, 20));

    }


}

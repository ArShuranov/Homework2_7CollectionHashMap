package service;

import model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<String, Employee> baseOfEmployees = new HashMap<>(Map.of(
            "ИванИвановичИванов", new Employee("Иван", "Иванович", "Иванов", 1, 100),
            "АндрейАндреевичАндреев", new Employee("Андрей", "Андреевич", "Андреев", 2, 200),
            "ОксанаОксановнаОксанова", new Employee("Оксана", "Оксановна", "Оксанова", 3, 300)));

    public Map<String, Employee> getBaseOfEmployees() {
        return baseOfEmployees;
    }


    public void addEmployee(Employee employee) {
        String key = employee.getFirstName() + employee.getPatronymic() + employee.getLastName();
        if (baseOfEmployees.containsKey(key)) {
            throw new RuntimeException("Такой сотрудник уже в базе");
        } else {
            baseOfEmployees.put(key, employee);
        }
    }

    public void removeEmployee(String fullName) {
        if (!baseOfEmployees.containsKey(fullName)) {
            throw new RuntimeException("Такого сотрудника нет в базе");
        } else {
            baseOfEmployees.remove(fullName);
        }
    }

    public Employee findEmployee(String fullName) {
        if (!baseOfEmployees.containsKey(fullName)) {
            throw new RuntimeException("Такого сотрудника нет в базе");
        }
        return baseOfEmployees.get(fullName);
    }

    public int sumSalary() {
        int result = 0;
        for (Employee value : baseOfEmployees.values()) {
            result += value.getSalary();
        }
        return result;
    }

    public int minSalary() {
        int result = 1000000;
        for (Employee value : baseOfEmployees.values()) {
            if (value.getSalary() < result) {
                result = value.getSalary();
            }
        }
        return result;
    }


}

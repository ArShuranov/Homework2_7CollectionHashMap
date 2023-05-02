import model.Employee;
import service.EmployeeServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/*Map<String, Employee> baseOfEmployees = new HashMap<>(Map.of());

("1", new Employee("Иван", "Иванович", "Иванов", 1, 20),
                        "2", new Employee("Иван", "Иванович", "Иванов", 1, 20),
                        "3", new Employee("Иван", "Иванович", "Иванов", 1, 20)));


        baseOfEmployees.put("Иванов", new Employee("Иван", "Иванович", "Иванов", 1, 20));

        System.out.println(baseOfEmployees);*/

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        System.out.println(employeeService.getBaseOfEmployees());

    }
}

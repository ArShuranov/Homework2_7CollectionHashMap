import model.Employee;
import service.EmployeeServiceImpl;


public class Main {
    public static void main(String[] args) {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        //Добавление нового сотрудника
        //employeeService.addEmployee(new Employee("Сидор", "Сидорович", "Сидоров", 3, 10));

        //печать всего списка
        // System.out.println(employeeService.getBaseOfEmployees());

        //поиск сотрудника
        //System.out.println(employeeService.findEmployee("ОксанаОксановнаОксанова"));

        //удаление сотрудника
        //employeeService.removeEmployee("СидорСидоровичСидоров");

        //сумма всех зп
        //System.out.println(employeeService.sumSalary());

        //минимальная зп во всей фирме
        //System.out.println(employeeService.minSalary());

    }
}

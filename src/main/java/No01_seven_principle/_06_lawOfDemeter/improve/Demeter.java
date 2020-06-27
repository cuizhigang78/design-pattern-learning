package No01_seven_principle._06_lawOfDemeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        CollegeManager collegeManager = new CollegeManager();
        schoolManager.printAllEmployee(collegeManager);
    }
}

// 学校员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院员工类
class CollegeEmployee extends Employee {

}

// 学院员工管理类
class CollegeManager {
    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    // 输出学院所有员工
    void printAllEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("-----学院员工-----");
        for (CollegeEmployee employee : list1) {
            System.out.println(employee.getId());
        }
    }
}

// 学校员工管理类
class SchoolManager {
    // 返回学校的所有员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    // 输出学校总部和学院所有员工
    void printAllEmployee(CollegeManager sub) {
        // 将输出学院员工的方法，封装到CollegeManager里面去
        sub.printAllEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----学校总部员工-----");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }
}

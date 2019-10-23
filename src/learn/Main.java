package learn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("use lambda");
            System.out.println("line 2");
            System.out.println("something");
        }).start();

        Employee Tom = new Employee("Tom", 22);
        Employee John = new Employee("John", 34);
        Employee Mark = new Employee("Mark", 44);
        Employee Rob = new Employee("Rob", 24);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Tom);
        employeeList.add(John);
        employeeList.add(Mark);
        employeeList.add(Rob);

//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });
        Collections.sort(employeeList, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
//        String sillyString =doStringStaff(new UpperCancat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase()+ s2.toUpperCase();
//            }
//        },
//                employeeList.get(0).getName(),employeeList.get(1).getName());
//        System.out.println(sillyString);
        UpperCancat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString2 = doStringStaff(uc, employeeList.get(2).getName(),
                employeeList.get(3).getName());
        System.out.println(sillyString2);
    }

    public final static String doStringStaff(UpperCancat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}


class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperCancat {
    public String upperAndConcat(String s1, String s2);
}


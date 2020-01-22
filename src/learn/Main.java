package learn;

import java.awt.event.MouseAdapter;
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
//
////        Collections.sort(employeeList, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee employee1, Employee employee2) {
////                return employee1.getName().compareTo(employee2.getName());
////            }
////        });
//        Collections.sort(employeeList, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for (Employee employee : employeeList) {
//            System.out.println(employee.getName());
//        }
////        String sillyString =doStringStaff(new UpperCancat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase()+ s2.toUpperCase();
////            }
////        },
////                employeeList.get(0).getName(),employeeList.get(1).getName());
////        System.out.println(sillyString);
//        UpperConcat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//        String sillyString2 = doStringStaff(uc, employeeList.get(2).getName(),
//                employeeList.get(3).getName());
//        System.out.println(sillyString2);

        AnotherClass anotherClass = new AnotherClass();
        String res = anotherClass.doSth();
        System.out.println(res);


    }

    public final static String doStringStaff(UpperConcat uc, String s1, String s2) {
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

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSth() {
//        return Main.doStringStaff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("Another class name " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
     /*   UpperConcat uc = (s1, s2) -> {
            System.out.println("lambda expression class is" + getClass().getSimpleName());
            String res = s1.toUpperCase() + s2.toUpperCase();
            return res;
        };*/
        int i = 0;
            UpperConcat uc = (s1,s2) -> {
                System.out.println("lambda expression");
                String res = s1.toUpperCase() + " " + s2.toUpperCase();
                return res;
            };

        System.out.println("the another class is " + getClass().getSimpleName());  //   return uc;
        return Main.doStringStaff(uc, "String1", "String2");
        //or  return Main.doStringStaff(( s1 , s2 ) ->s1.toUpperCase()+s2.toUpperCase(), "String1", "String2\"");
        //   without creating uc variable

    }
}

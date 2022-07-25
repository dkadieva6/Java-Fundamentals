package ObjectsAndClasses.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P01CompanyRoster {
    static class Department {
        String name;
        List<Employee> employee;
        double avgSalary;

        public Department(String name, List<Employee> employee) {
            this.name = name;
            this.employee = employee;
            this.avgSalary = employee.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        }

        public double getAvgSalary() {
            return avgSalary;
        }

        public String getName() {
            return name;
        }

        public List<Employee> getEmployee() {
            return employee;
        }
    }

    static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        public Employee() {
            this.email = "n/a";
            this.age = -1;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            Employee employee = new Employee();

            employee.setName(input[0]);
            employee.setSalary(Double.parseDouble(input[1]));
            employee.setPosition(input[2]);
            employee.setDepartment(input[3]);

            switch (input.length) {
                case 5:
                    if (input[4].contains("@")) {
                        employee.setEmail(input[4]);
                    } else {
                        employee.setAge(Integer.parseInt(input[4]));
                    }
                    break;

                case 6:
                    if (input[4].contains("@")) {
                        employee.setEmail(input[4]);
                        employee.setAge(Integer.parseInt(input[5]));
                    } else {
                        employee.setAge(Integer.parseInt(input[4]));
                        employee.setEmail(input[5]);
                    }
                    break;
            }

            employees.add(employee);
        }

        List<String> departmentsList = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

        List<Department> departments = new ArrayList<>();
        for (String department : departmentsList) {
            departments.add(new Department(department, employees.stream().filter(employee -> employee.getDepartment().equals(department)).collect(Collectors.toList())));
        }

        departments.sort(Comparator.comparingDouble(Department::getAvgSalary).reversed());
        Department department = departments.get(0);

        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.printf("Highest Average Salary: %s%n", department.getName());

        for (Employee employee : department.getEmployee()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}

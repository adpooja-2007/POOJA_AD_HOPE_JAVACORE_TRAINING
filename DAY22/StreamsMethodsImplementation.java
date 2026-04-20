import java.util.List;
class Employee {
    String name;
    String dept;
    int salary;
    int age;
    Employee(String name, String dept, int salary, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

public class StreamsMethodsImplementation {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
                new Employee("Emp1", "dev", 60000, 25),
                new Employee("Emp2", "hr", 40000, 30),
                new Employee("Emp3", "support", 55000, 28),
                new Employee("Emp4", "dev", 70000, 35)
        );

        List<Employee> devEmployees = emp.stream()
                .filter(e -> e.getDept().equals("dev"))
                .toList();
        System.out.println(devEmployees.size());

        List<Employee> highSalary = emp.stream()
                .filter(e -> e.getSalary() > 50000)
                .toList();
        System.out.println(highSalary.size());

        int totalSalary = emp.stream()
                .mapToInt(e -> e.getSalary())
                .sum();
        System.out.println(totalSalary);

        double avgSalary = emp.stream()
                .mapToInt(e -> e.getSalary())
                .average()
                .orElse(0);
        System.out.println(avgSalary);

        long count = emp.stream().count();
        System.out.println(count);
    }
}
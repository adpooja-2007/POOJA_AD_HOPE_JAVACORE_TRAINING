import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class StreamsExample1 {
    public static void main(String[] args) {

        List<Employee> emp = List.of(
                new Employee("Employee1", 22222),
                new Employee("Employee2", 44444)
        );

        List<String> employeenames = emp.stream()
                                        .map(i -> i.getName())
                                        .toList();

        System.out.println(employeenames);  
    }
}
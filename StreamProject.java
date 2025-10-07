
import java.util.ArrayList;
import java.util.List;

class Employee{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
}
public class StreamProject {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Spoorthy", 24));
        employees.add(new Employee("Archana", 23));
        System.out.println(employees.stream().filter(e->e.age>22).map(e->e.name).toList());

    }
}

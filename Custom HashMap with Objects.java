import java.util.HashMap;
import java.util.Objects;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Employee)) return false;

        Employee other = (Employee) obj;

        return this.id == other.id;
    }
}

public class Main {

    public static void main(String[] args) {

        HashMap<Employee, Double> employees = new HashMap<>();

        employees.put(new Employee(101, "Tabrej"), 50000.0);
        employees.put(new Employee(102, "Rahul"), 60000.0);

        System.out.println(
            employees.get(new Employee(101, "Different Name"))
        );
    }
}

class Employee {
    int id;
    String name;
    double salary;

    // Constructor using this keyword
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class G {
    public static void main(String[] args) {
        Employee e1 = new Employee(26, "Gurman", 100000);
        e1.display();
    }
}
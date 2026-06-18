class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}

public class Gurman1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student(1, "Gurman");
        students[1] = new Student(2, "Anshika");
        students[2] = new Student(3, "Anshman");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
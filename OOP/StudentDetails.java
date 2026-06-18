import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String course;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
    }
}

public class StudentDetails{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getDetails();
        s1.displayDetails();
    }
}



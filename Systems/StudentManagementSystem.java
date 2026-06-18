import java.util.Scanner;

class Person {
    static Scanner ob = new Scanner(System.in);

    String name;
    int age;

    void getPersonData() {
        System.out.print("Enter Name: ");
        name = ob.nextLine();

        System.out.print("Enter Age: ");
        age = ob.nextInt();
        ob.nextLine();
    }

    void displayPersonData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void getStudentData() {
        System.out.print("Enter Roll Number: ");
        rollNo = ob.nextInt();
        ob.nextLine();

        System.out.print("Enter Course: ");
        course = ob.nextLine();
    }

    void displayStudentData() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class GraduateStudent extends Student {
    String specialization;
    double cgpa;

    void getGraduateData() {
        System.out.print("Enter Specialization: ");
        specialization = ob.nextLine();

        System.out.print("Enter Cgpa: ");
        cgpa = ob.nextDouble();
    }

    void displayGraduateData() {
        System.out.println("Specialization: " + specialization);
        System.out.println("Cgpa: " + cgpa);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        GraduateStudent gs = new GraduateStudent();

        System.out.println("----- Enter Student Details -----");

        gs.getPersonData();
        gs.getStudentData();
        gs.getGraduateData();

        System.out.println("\n----- Student Information -----");

        gs.displayPersonData();
        gs.displayStudentData();
        gs.displayGraduateData();
    }
}

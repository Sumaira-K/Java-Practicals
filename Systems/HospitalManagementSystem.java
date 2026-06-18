import java.util.Scanner;

class Person {
    String name;
    int age;
    Scanner ob = new Scanner(System.in);

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

class Doctor extends Person {
    int doctorId;
    String department;

    void getDoctorData() {
        System.out.print("Enter Doctor ID: ");
        doctorId = ob.nextInt();
        ob.nextLine();

        System.out.print("Enter Department: ");
        department = ob.nextLine();
    }

    void displayDoctorData() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Department: " + department);
    }
}

class SpecialistDoctor extends Doctor {
    String specialization;
    double consultationFee;

    void getSpecialistData() {
        System.out.print("Enter Specialization: ");
        specialization = ob.nextLine();

        System.out.print("Enter Consultation Fee: ");
        consultationFee = ob.nextDouble();
    }

    void displaySpecialistData() {
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {

        SpecialistDoctor sd = new SpecialistDoctor();

        System.out.println("----- Enter Specialist Doctor Details -----");

        sd.getPersonData();
        sd.getDoctorData();
        sd.getSpecialistData();

        System.out.println("\n----- Doctor Details -----");

        sd.displayPersonData();
        sd.displayDoctorData();
        sd.displaySpecialistData();
    }
}

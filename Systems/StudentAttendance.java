import java.util.Scanner;

class StudentAttendance {

    void attendance(String date, String... students) {
        System.out.println("\nAttendance for Date: " + date);
        System.out.println("Total Students Present: " + students.length);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Present: " + students[i]);
        }
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        StudentAttendance attendance = new StudentAttendance();

        System.out.print("Enter Date (DD-MM-YYYY): ");
        String date = ob.nextLine();

        System.out.print("Enter number of students present: ");
        int n = ob.nextInt();
        ob.nextLine(); 

        String[] students = new String[n];
 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = ob.nextLine();
        }

        attendance.attendance(date, students);

        ob.close();
    }
}

import java.util.Scanner;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is turned ON.");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n----- Smart Home Automation System -----");
            System.out.println("1. Light");
            System.out.println("2. Fan");
            System.out.println("3. AC");
            System.out.println("4. Exit");
            System.out.print("Select Device: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting System...");
                sc.close();
                System.exit(0);
            }

            SmartDevice device = null;

            switch (choice) {
                case 1:
                    device = new Light();
                    break;
                case 2:
                    device = new Fan();
                    break;
                case 3:
                    device = new AC();
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }

            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.print("Select Operation: ");
            int operation = sc.nextInt();

            if (operation == 1) {
                device.turnOn();
            } else if (operation == 2) {
                device.turnOff();
            } else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}

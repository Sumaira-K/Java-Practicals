import java.util.Scanner;
class Alarm {
    int alarmHour;
    int alarmMinute;
    void setAlarm(int h, int m) {
        alarmHour = h;
        alarmMinute = m;
    }
    void checkAlarm(int currentHour, int currentMinute) {
        if (alarmHour == currentHour && alarmMinute == currentMinute) {
            System.out.println("Alarm Ringing!");
        } else {
            System.out.println("Alarm not ringing.");
        }
    }
}
public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alarm alarm = new Alarm();
        System.out.print("Set Alarm Hour (0-23): ");
        int ah = sc.nextInt();
        System.out.print("Set Alarm Minute (0-59): ");
        int am = sc.nextInt();
        alarm.setAlarm(ah, am);
        System.out.print("Enter Current Hour (0-23): ");
        int ch = sc.nextInt();
        System.out.print("Enter Current Minute (0-59): ");
        int cm = sc.nextInt();
        alarm.checkAlarm(ch, cm);
    }
}


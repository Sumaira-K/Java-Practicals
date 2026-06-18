import java.util.Scanner;

public class IntegerValueOfDemo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = ob.nextLine();

        Integer num = Integer.valueOf(input);

        System.out.println("\nDecimal value: " + num);
        System.out.println("Binary value: " + Integer.toBinaryString(num));
        System.out.println("Octal value: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal value: " + Integer.toHexString(num));

        ob.close();
    }
}
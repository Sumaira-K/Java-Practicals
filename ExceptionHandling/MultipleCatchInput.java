import java.util.Scanner;

public class MultipleCatchInput {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("=== Multiple Try-Catch Examples ===\n");

        System.out.println("Example 1: Division Operation");
        try {
            System.out.print("Enter dividend: ");
            int dividend = ob.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = ob.nextInt();
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input! " + e.getMessage());
        }

        ob.nextLine();

        System.out.println("\nExample 2: Array Access");
        try {
            System.out.print("Enter array size: ");
            int size = ob.nextInt();
            int[] arr = new int[size];

            System.out.print("Enter index to access: ");
            int index = ob.nextInt();

            System.out.print("Enter value to store: ");
            arr[index] = ob.nextInt();
            System.out.println("Value stored successfully!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input! " + e.getMessage());
        }

        ob.nextLine();

        System.out.println("\nExample 3: String to Number Conversion");
        try {
            System.out.print("Enter a number as string: ");
            String numberString = ob.nextLine();
            int number = Integer.parseInt(numberString);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }

        System.out.println("\nExample 4: String Character Access");
        try {
            System.out.print("Enter a string: ");
            String str = ob.nextLine();
            System.out.print("Enter character index: ");
            int charIndex = ob.nextInt();
            char ch = str.charAt(charIndex);
            System.out.println("Character at index " + charIndex + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds for string!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        }

        ob.close();
        System.out.println("\nProgram ended.");
    }
}

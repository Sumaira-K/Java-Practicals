public class MultipleCatch {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException example
        try {
            int arr[] = new int[5];
            arr[10] = 100; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // ArithmeticException example
        try {
            int a = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}

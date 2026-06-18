import java.util.Scanner;
public class UncheckedExample {
    public static void main(String[] args)
     {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ob.nextLine();
        try{
            validateName(name);
            System.out.println("Name: " +name + "!");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        ob.close();
    }
    // Method to validate the name input
    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }
}

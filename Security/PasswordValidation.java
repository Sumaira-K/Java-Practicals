import java.util.Scanner;
class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (password.length() >= 8)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid (minimum 8 characters required)");
    }
}


import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = ob.nextLine();

        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        boolean flag = true;

        while (i < j) {
            if (arr[i] != arr[j]) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        ob.close();
    }
}
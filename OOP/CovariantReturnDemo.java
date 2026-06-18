import java.util.Scanner;

class Food {
    String name;

    Food getFood() {
        return this;
    }

    void display() {
        System.out.println("Food item: " + name);
    }
}

class Pizza extends Food {

    Pizza getFood() {
        return this;
    }

    void display() {
        System.out.println("You ordered a Pizza: " + name);
    }
}

class Burger extends Food {

    Burger getFood() {
        return this;
    }

    void display() {
        System.out.println("You ordered a Burger: " + name);
    }
}

public class CovariantReturnDemo {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.println("Select food type:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.print("Enter choice: ");

        int choice = ob.nextInt();
        ob.nextLine();

        if(choice == 1) {
            Pizza p = new Pizza();
            System.out.print("Enter pizza name: ");
            p.name = ob.nextLine();
            Pizza result = p.getFood();
            result.display();
        }
        else if(choice == 2) {
            Burger b = new Burger();
            System.out.print("Enter burger name: ");
            b.name = ob.nextLine();
            Burger result = b.getFood();
            result.display();
        }
        else {
            System.out.println("Invalid choice");
        }

        ob.close();
    }
}
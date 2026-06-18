import java.util.Scanner;

class FoodOrder {

    void orderFood(String itemName) {
        System.out.println("You ordered: " + itemName);
        System.out.println("Preparing your food...");
    }

    void orderFood(String itemName, int quantity) {
        System.out.println("You ordered: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Preparing your food...");
    }

    void orderFood(String itemName, int quantity, double price) {
        double total = quantity * price;
        System.out.println("You ordered: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total bill: " + total);
        System.out.println("Preparing your food...");
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        FoodOrder obj = new FoodOrder();

        int choice = 0;

        while(choice != 4) {

            System.out.println("\n--- Food Ordering System ---");
            System.out.println("1. Order with item name");
            System.out.println("2. Order with item name and quantity");
            System.out.println("3. Order with item name, quantity and price");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = ob.nextInt();
            ob.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter item name: ");
                    String item1 = ob.nextLine();
                    obj.orderFood(item1);
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    String item2 = ob.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty2 = ob.nextInt();
                    obj.orderFood(item2, qty2);
                    break;

                case 3:
                    System.out.print("Enter item name: ");
                    String item3 = ob.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty3 = ob.nextInt();
                    System.out.print("Enter price per item: ");
                    double price3 = ob.nextDouble();
                    obj.orderFood(item3, qty3, price3);
                    break;

                case 4:
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        ob.close();
    }
}
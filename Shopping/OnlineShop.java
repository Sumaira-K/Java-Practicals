import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}

class Billing {
    void generateBill(Product p) {

        double gst = p.price * 0.18;
        double total = p.price + gst;

        System.out.println("\n--- Bill Details ---");
        System.out.println("Product ID: " + p.productId);
        System.out.println("Product Name: " + p.productName);
        System.out.println("Price: " + p.price);
        System.out.println("GST (18%): " + gst);
        System.out.println("Total Amount: " + total);
    }
}

public class OnlineShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        Product p1 = new Product(id, name, price);

        Billing b = new Billing();
        b.generateBill(p1);   // Passing object as parameter

        sc.close();
    }
}
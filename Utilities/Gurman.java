class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Billing {
    void generateBill(Product p) {
        System.out.println("Product ID: " + p.id);
        System.out.println("Product Name: " + p.name);
        System.out.println("Price: " + p.price);
    }
}

public class Gurman{
    public static void main(String[] args) {
        Product p1 = new Product(1, "Shoes", 1200);
        Billing bill = new Billing();
        bill.generateBill(p1);
    }
}
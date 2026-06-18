class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    void displayProductDetails() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
    }
}
public class OnlineShopping {
    public static void main(String[] args) {
        Product p1 = new Product(300, "Laptop", 70000.50, 2);
        p1.displayProductDetails();
    }
}

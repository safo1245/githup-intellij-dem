public class Product {
    //  variables
    private String id;
    private String name;
    private double price;
    private double discount;

    // Constructor
    public Product(String id, String name, double price, double discount) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Getter methods
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getDiscount() { return discount; }

    // Method
    public double priceAfterDiscount() {
        double discountAmount = price * (discount / 100);
        return price - discountAmount;
    }

    // Method
    public double finalPrice() {
        double discountedPrice = priceAfterDiscount();
        double vat = discountedPrice * 0.05;
        return discountedPrice + vat;
    }

    // Method
    public void showCalculation() {
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount (" + discount + "%): $" + (price * discount / 100));
        System.out.println("Price After Discount: $" + priceAfterDiscount());
        System.out.println("VAT (5%): $" + (priceAfterDiscount() * 0.05));
        System.out.println("Final Price (After VAT): $" + finalPrice());
        System.out.println("--------------------------------------");
    }
}
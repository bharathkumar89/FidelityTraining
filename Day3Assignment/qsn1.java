class Product {
    int proid;
    String proname;
    double price;

    Product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + proid + ", Name: " + proname + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(101, "Laptop", 750.50);
        products[1] = new Product(102, "Smartphone", 499.99);
        products[2] = new Product(103, "Tablet", 299.99);
        products[3] = new Product(104, "Smartwatch", 199.99);
        products[4] = new Product(105, "Headphones", 99.99);

        for (Product p : products) {
            p.display();
        }
    }
}

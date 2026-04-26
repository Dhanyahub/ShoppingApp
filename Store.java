import java.util.*;

class Store {
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Milk", 50));
        products.add(new Product(2, "Bread", 30));
        products.add(new Product(3, "Eggs", 70));
    }

    static void showProducts() {
        for (Product p : products) {
            p.display();
        }
    }

    static Product getProduct(int id) {
        for (Product p : products) {
            if (p.id == id) return p;
        }
        return null;
    }
}
import java.util.*;

class Cart {
    List<CartItem> items = new ArrayList<>();

    void addProduct(Product p, int qty) {
        items.add(new CartItem(p, qty));
        System.out.println(p.name + " added to cart ,Buyyy Later!");
    }

    void viewCart() {
        double total = 0;

        System.out.println("\n--- CART ---");
        for (CartItem item : items) {
            System.out.println(item.product.name +
                " | Qty: " + item.quantity +
                " | ₹" + item.getTotal());
            total += item.getTotal();
        }

        System.out.println("Total Amount: ₹" + total);
    }
}
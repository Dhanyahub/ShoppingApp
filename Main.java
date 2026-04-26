import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default user
        User user = new User("dhanya", "1234");

        // LOGIN
        System.out.println("---- LOGIN ----");
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();

        if (!user.login(u, p)) {
            System.out.println("Invalid Login!");
            return;
        }

        System.out.println("Login Successful!\n");

        Cart cart = new Cart();

        while (true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Store.showProducts();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    Product pdt = Store.getProduct(id);

                    if (pdt != null) {
                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();
                        cart.addProduct(pdt, qty);
                    } else {
                        System.out.println("Invalid Product!");
                    }
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}